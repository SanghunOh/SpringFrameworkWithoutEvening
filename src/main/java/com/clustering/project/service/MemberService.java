package com.clustering.project.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clustering.project.dao.ShareDao;
import com.clustering.project.util.CommonUtil;
import com.clustering.project.util.Pagination;

@Service
public class MemberService {

	@Autowired
	private ShareDao dao;
	
	@Autowired
	private CommonUtil commonUtil;

	@Autowired
	private AuthorityRmemberService authorityRmemberService;

	public Object getList(Object dataMap) {
		String sqlMapId = "member.list";

		Object resultObject = dao.getList(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object getListPagination(Object dataMap) {
		Map<String, Object> resultMap = new HashMap<String, Object>() ;

		String sqlMapId = "member.totalcount";

		int totalCount = (int) dao.getObject(sqlMapId, dataMap);
		int currentrentPage = 1 ; 
		if(((Map<String,Object>) dataMap).get("currentPage") != null) {
			currentrentPage = Integer.valueOf(((Map<String, String>) dataMap).get("currentPage"));
		}
		Pagination pagination = new Pagination(totalCount, currentrentPage);
		resultMap.put("pagination", pagination);
		
		sqlMapId = "member.listpagination";
		((Map<String, Object>) dataMap).put("pagination", pagination);
		Object resultList = dao.getList(sqlMapId, dataMap);
		resultMap.put("resultList", resultList);
		
		return resultMap;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "member.read";

		Map resultObject = (Map) dao.getObject(sqlMapId, dataMap);
		
		// Get Authorities By Member_seq
		sqlMapId = "authorityRmember.list";
		resultObject.put("authorityList", dao.getList(sqlMapId, dataMap));
		
		// Get Authorities By Member_seq
		sqlMapId = "attachfile.list";
		((Map) dataMap).put("SOURCE_UNIQUE_SEQ", ((Map) dataMap).get("MEMBER_SEQ"));
//		resultObject.put("attachFileList", dao.getList(sqlMapId, dataMap));

		return resultObject;
	}

//	@Transactional
	public Object saveObject(Object dataMap) {
		Map<String, Object> paramMap = (Map<String, Object>) dataMap;
		String uniqueSequence = (String) paramMap.get("MEMBER_SEQ");
		String password = (String) paramMap.get("PASSWORD");
		
		if(uniqueSequence == null || "".equals(uniqueSequence)){
			uniqueSequence = commonUtil.getUniqueSequence();
		}
		paramMap.put("MEMBER_SEQ", uniqueSequence);
		paramMap.put("CRYPT_PASSWORD", commonUtil.PasswordEncoderGenerator(password));
		paramMap.put("REGISTER_SEQ", "UUID-1111-1111111");
		paramMap.put("MODIFIER_SEQ", "UUID-1111-1111111");
		
		String sqlMapId = "member.merge";

		Integer resultKey = (Integer) dao.saveObject(sqlMapId, paramMap);

		// insert Authority by Member
		authorityRmemberService.insertObject(paramMap);

		// reading member information
		Map resultObject = (Map) this.getObject(paramMap);

		return resultObject;
	}

	public Object deleteObject(Object dataMap) {
		// delete child record authority
		String sqlMapId = "authorityRmember.delete";

		Integer resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		// delete Mother record authority
		sqlMapId = "member.delete";

		resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		// get Member List
		sqlMapId = "member.list";
		
		Object resultObject = dao.getList(sqlMapId, dataMap);
		
		return resultObject;
	}
}
