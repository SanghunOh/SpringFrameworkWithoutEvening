/**
 * 
 */
package com.clustering.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.clustering.project.service.AuthorityService;
import com.clustering.project.service.OrganizationService;

/**
 * @author ohsanghun
 *
 */
@RestController
public class RestWSController {

	private final static String MAPPING = "/ws/";

	@Autowired
	private AuthorityService authorityService;

	@Autowired
	private OrganizationService organizationService;

	// Restful
	@RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST }, produces = "application/json")
	public Object actionMethod(Map<String, Object> paramMap, @PathVariable String action) {
		
//		List<Object> resultObject = new ArrayList<Object>();
		Object resultObject = new Object();

		// divided depending on action value
		if ("authorityList".equalsIgnoreCase(action)) {
			resultObject = (List<Object>) authorityService.getList(paramMap);
		} else if ("organizationList".equalsIgnoreCase(action)) {
			resultObject = (List<Object>) organizationService.getList(paramMap);
		} 
 
		return resultObject;	
	}
	
}
