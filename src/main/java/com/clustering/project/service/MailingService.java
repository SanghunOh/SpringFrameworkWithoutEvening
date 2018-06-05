package com.clustering.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clustering.project.dao.ShareDao;
import com.clustering.project.util.CommonUtil;

@Service
public class MailingService {

	@Autowired
	private ShareDao dao;
	
	@Autowired
	private CommonUtil commonUtil;

	@Autowired
	private AuthorityRmemberService authorityRmemberService;

	public List<Object> getList(Object dataMap) {
		String sqlMapId = "member.list";

		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "member.read";

		Map resultObject = (Map) dao.getObject(sqlMapId, dataMap);
		
		// Get Authorities By Member_seq
		sqlMapId = "authorityRmember.list";
		resultObject.put("authorityList", dao.getList(sqlMapId, dataMap));
		
		return resultObject;
	}

	public Object saveObject(Map<String, Object> dataMap) {
		String uniqueSequence = (String) dataMap.get("MEMBER_SEQ");
		String password = (String) dataMap.get("PASSWORD");
		
		if("".equals(uniqueSequence)){
			uniqueSequence = commonUtil.getUniqueSequence();
		}
		dataMap.put("MEMBER_SEQ", uniqueSequence);
		dataMap.put("CRYPT_PASSWORD", commonUtil.PasswordEncoderGenerator(password));
		dataMap.put("REGISTER_SEQ", "UUID-1111-1111111");
		dataMap.put("MODIFIER_SEQ", "UUID-1111-1111111");
		
		String sqlMapId = "member.merge";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);

		// insert Authority by Member
//		authorityRmemberService.saveObject(dataMap);	// non DB Transaction
		sqlMapId = "authorityRmember.merge";	// DB Transaction
		dao.saveObject(sqlMapId, dataMap);

		// reading member information
		Map resultObject = (Map) this.getObject(dataMap);

		return resultObject;
	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "member.delete";

		Integer resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		sqlMapId = "member.list";
		
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		
		return resultObject;
	}
}
