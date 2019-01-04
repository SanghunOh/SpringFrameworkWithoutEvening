/**
 * 
 */
package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.service.CommonCodeService;

/**
 * @author ohsanghun
 *
 */
@Controller
public class CommonCodeController {

	@Autowired
	private CommonCodeService service;
    
	// Receive Parameters from Html Using @RequestParam Map with @PathVariable
	@RequestMapping(value = "/commonCode/{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

        String viewName = "/commonCode/" ;

		Map<String, Object> resultMap = new HashMap<String, Object>() ;
		List<Object> resultList = new ArrayList<Object>();

		// divided depending on action value
		if ("edit".equalsIgnoreCase(action)) {
			viewName = viewName + action;
		} else if ("read".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = (Map<String, Object>) service.getObject(viewName, paramMap);
		} else if ("list".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultList = service.getList(viewName, paramMap);
		} else {
			viewName = viewName + "list";
		} 

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		modelandView.addObject("resultList", resultList);
		return modelandView;
	}
}
