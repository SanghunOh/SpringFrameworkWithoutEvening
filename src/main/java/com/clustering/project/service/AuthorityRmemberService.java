package com.clustering.project.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clustering.project.dao.ShareDao;
import com.clustering.project.util.CommonUtil;

@Service
public class AuthorityRmemberService {

	@Autowired
	private ShareDao dao;
	
	public List<Object> getList(Object dataMap) {
		String sqlMapId = "authorityRmember.list";
		
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);

		return resultObject;
	}

	public Object getObject(Object dataMap) {
		String sqlMapId = "authorityRmember.read";
		
		Object resultObject = dao.getObject(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object saveObject(Object dataMap) {
		String sqlMapId = "authorityRmember.merge";
		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);
		
		return resultKey;
	}

	public Object insertObject(Object dataMap) {
		String sqlMapId = "authorityRmember.delete";
		Integer resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);
		Object campareObject = ((Map)dataMap).get("AUTHORITY_ID");
		
		if(campareObject instanceof List) {
			sqlMapId = "authorityRmember.insert";
		} else {
			sqlMapId = "authorityRmember.merge";
		}

		resultKey = (Integer) dao.saveObject(sqlMapId, dataMap);
		
		return resultKey;
	}

	public Object deleteObject(Object dataMap) {
		String sqlMapId = "authorityRmember.delete";

		Integer resultKey = (Integer) dao.deleteObject(sqlMapId, dataMap);

		sqlMapId = "authorityRmember.list";
		
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		
		return resultObject;
	}
}
