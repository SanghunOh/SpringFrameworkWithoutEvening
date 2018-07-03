/**
 * 
 */
package com.clustering.project.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ohsanghun
 *
 */
@Controller
public class ExceptionController {

	private final static String MAPPING = "/exception/";

	// access denied page
	@RequestMapping(value = {MAPPING+"{action}","/404"}, method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam MultiValueMap<Object, Object> paramMultiMap
			, @RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView, Principal user) {

		String viewName = MAPPING + action ;
		String forwardView = (String) paramMap.get("forwardView") ;

		Map<String, Object> resultMap = new HashMap<String, Object>() ;
		List<Object> resultList = new ArrayList<Object>();
		
		Map<String, Object> errorMessageMap = new HashMap<String, Object>() ;
		String errorTitle = action;
		String errorMessage = null;
		
		// divided depending on action value
		if (user != null) {
			errorMessage = "Hi [" + user.getName() 
					+ "], you do not have permission to access this page!";
		} else {
			errorMessage = "You do not have permission to access this page!";
		}

		if(forwardView != null){
			viewName = forwardView;
		}
		
		errorMessageMap.put("errorTitle", errorTitle);
		errorMessageMap.put("errorMessage", errorMessage);

		modelandView.setViewName(viewName);

		modelandView.addObject("errorMessageMap", errorMessageMap);
		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		modelandView.addObject("resultList", resultList);
		
		return modelandView;
	}
}
