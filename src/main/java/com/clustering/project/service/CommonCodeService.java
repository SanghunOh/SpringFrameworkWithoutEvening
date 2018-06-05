package com.clustering.project.service;

import java.util.List;

import com.clustering.project.dao.CommonCodeDao;

public class CommonCodeService {

	private CommonCodeDao dao;
	
	public void setDao(CommonCodeDao commonCodeDao) {
		this.dao = commonCodeDao;
	}

	public List<Object> getList(String sqlMapId, Object dataMap) {
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		return resultObject;
	}

	public Object getObject(String sqlMapId, Object dataMap) {
		Object resultObject = dao.getObject(sqlMapId, dataMap);
		return resultObject;
	}

	public Object saveObject(String sqlMapId, Object dataMap) {
		return null;
	}

	public Object deleteObject(String sqlMapId, Object dataMap) {
		return null;
	}
}
