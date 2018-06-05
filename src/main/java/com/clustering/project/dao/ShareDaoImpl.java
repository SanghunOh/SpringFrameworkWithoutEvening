package com.clustering.project.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ShareDaoImpl implements ShareDao {

	@Override
	public List<Object> getList(String sqlMapId, Object dataMap) {
		List<Object> resultObject = new ArrayList<Object>();
		
		Map<String, Object> data01 = new HashMap<String, Object>();
		Map<String, Object> data02 = new HashMap<String, Object>();
		Map<String, Object> data03 = new HashMap<String, Object>();
		
		data01.put("MEMBER_ID", "103029301202");
		data01.put("NAME", "name 01");
		data01.put("CELLPHONE", "001-2930-2938");		
		data01.put("EMAIL", "Anders@gmail.com");		
		data01.put("COMMON_CODE_ID", "490293232849");
		data01.put("DESCRIPTION", "anything DESCRIPTION 01");
		data01.put("ORGANIZATION_SEQ", "UUID-00482983293");
		data01.put("TELEPHONE", "031-2930-3920");
		data01.put("ORDER_NUMBER", 1);
		resultObject.add(data01);

		data02.put("MEMBER_ID", "293029301202");
		data02.put("NAME", "name 02");
		data02.put("CELLPHONE", "001-3923-6940");		
		data02.put("EMAIL", "Hacker@bnt.com");		
		data02.put("COMMON_CODE_ID", "590293232849");
		data02.put("DESCRIPTION", "anything DESCRIPTION 02");
		data02.put("ORGANIZATION_SEQ", "UUID-10482983293");
		data02.put("TELEPHONE", "02-2930-3920");
		data02.put("ORDER_NUMBER", 2);
		resultObject.add(data02);

		data03.put("MEMBER_ID", "323029301202");
		data03.put("NAME", "name 03");
		data03.put("CELLPHONE", "001-9503-1274");		
		data03.put("EMAIL", "polly@daddy.com");		
		data03.put("COMMON_CODE_ID", "690293232849");
		data03.put("DESCRIPTION", "anything DESCRIPTION 03");
		data03.put("ORGANIZATION_SEQ", "UUID-20482983293");
		data03.put("TELEPHONE", "042-2930-3920");
		data03.put("ORDER_NUMBER", 3);
		resultObject.add(data03);
		
		return resultObject;
	}

	@Override
	public Object getObject(String sqlMapId, Object dataMap) {
		Map<String, Object> resultObject = new HashMap<String, Object>();
		
		resultObject.put("MEMBER_ID", "293029301202");
		resultObject.put("NAME", "name 02");
		resultObject.put("PASSWORD", "hidden_password");
		resultObject.put("CELLPHONE", "001-3923-6940");		
		resultObject.put("EMAIL", "Hacker@bnt.com");		
		resultObject.put("MEMBER_SEQ", "103029301202-UUID");
		resultObject.put("COMMON_CODE_ID", "590293232849");
		resultObject.put("DESCRIPTION", "Yes or No. \nAnything writing.");
		resultObject.put("PARENT_COMMON_CODE_ID", "UUID-10482983293");
		resultObject.put("ORGANIZATION_SEQ", "UUID-10482983293");
		resultObject.put("TELEPHONE", "02-2930-3920");
		resultObject.put("ORDER_NUMBER", 2);

		return resultObject;
	}

	@Override
	public Object saveObject(String sqlMapId, Object dataMap) {
		Integer resultObject = 1;
		return resultObject;
	}

	@Override
	public Object deleteObject(String sqlMapId, Object dataMap) {
		// TODO Auto-generated method stub
		return null;
	}

}
