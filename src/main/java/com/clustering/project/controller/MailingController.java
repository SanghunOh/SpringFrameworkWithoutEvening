/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.component.MailComponent;

@Controller
public class MailingController {
	private final static String MAPPING = "/mailing/";
	
	@Autowired
	private MailComponent component;
	
	@RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		String viewName = MAPPING + action ;
		String forwardView = (String) paramMap.get("forwardView") ;
		String popupYN = (String) paramMap.get("popupYN") ;

		Map<String, Object> resultMap = new HashMap<String, Object>() ;
		List<Object> resultList = new ArrayList<Object>();

		// divided depending on action value
		if ("edit".equalsIgnoreCase(action)) {
		} else if ("sending".equalsIgnoreCase(action)) {
			resultMap.put("returnMeg", component.sendMail(paramMap));
		} 
		
		if(forwardView != null){
			viewName = forwardView;
		}
		
		// Resolves Popup Yes or No
		if("Yes".equals(popupYN)){
			viewName = viewName.replaceFirst("/", "");
		}

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", paramMap);
		modelandView.addObject("resultList", resultList);
		return modelandView;
	}
	
}