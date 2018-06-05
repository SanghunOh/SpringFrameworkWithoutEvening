/**
 * 
 */
package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.clustering.project.service.AuthorityService;
import com.clustering.project.service.OrganizationService;
import com.clustering.project.service.RestWSService;

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

	@Autowired
	private RestWSService restWSService;

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
		} else if ("openweathermap".equalsIgnoreCase(action)) {
			resultObject = (String)restWSService.getObject(paramMap);
		} 
 
		return resultObject;	
	}
	
	public Object SampleactionMethodXML(Map<String, Object> paramMap, @PathVariable String action) {
		
		Object resultObject = new Object();

		return (List<Object>)resultObject;	
	}

	@ExceptionHandler
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	private String handleException(Exception ex){
		return ex.getMessage();
	}
}
