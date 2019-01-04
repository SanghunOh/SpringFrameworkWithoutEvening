package com.clustering.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clustering.project.dao.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao dao;
	
	@Override
	public List<Object> getList(String sqlMapId, Object dataMap) {
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		return resultObject;
	}

	@Override
	public Object getObject(String sqlMapId, Object dataMap) {
		Object resultObject = dao.getObject(sqlMapId, dataMap);
		return resultObject;
	}

	@Override
	public Object saveObject(String sqlMapId, Object dataMap) {
		Object resultObject = dao.saveObject(sqlMapId, dataMap);
		return resultObject;
	}

	@Override
	public Object deleteObject(String sqlMapId, Object dataMap) {
		Object resultObject = dao.deleteObject(sqlMapId, dataMap);
		return resultObject;
	}

}
