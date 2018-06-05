package com.clustering.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.clustering.project.dao.CommonCodeDao;

public class OrganizationService implements ShareService {

	private CommonCodeDao dao;
	
	public OrganizationService(){}

	public OrganizationService(CommonCodeDao commonCodeDao) {
		this.dao = commonCodeDao;
	}

	@Override
	public List<Object> getList(String sqlMapId, Object dataMap) {
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		return resultObject;
	}

	@Override
	public Object getObject(String sqlMapId, Object dataMap) {
		Map<String, Object> resultObject = new HashMap<String, Object>();

		resultObject.put("NAME", "name 02");
		resultObject.put("ORGANIZATION_SEQ", "UUID-10482983293");
		resultObject.put("TELEPHONE", "02-2930-3920");
		resultObject.put("ORDER_NUMBER", 2);
		
		return resultObject;
	}

	@Override
	public Object saveObject(String sqlMapId, Object dataMap) {
		return null;
	}

	@Override
	public Object deleteObject(String sqlMapId, Object dataMap) {
		return null;
	}
}
