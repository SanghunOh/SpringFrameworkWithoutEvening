/**
 * 
 */
package com.clustering.project.controller;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
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
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView, Principal user, HttpServletRequest request) {

		String viewName = MAPPING + action ;

		Map<String, Object> errorMessageMap = new HashMap<String, Object>() ;		
		errorMessageMap.put("errorTitle", request.getAttribute("javax.servlet.error.status_code"));
		errorMessageMap.put("errorMessage", request.getAttribute("javax.servlet.error.message"));

		modelandView.setViewName(viewName);

		modelandView.addObject("errorMessageMap", errorMessageMap);
		modelandView.addObject("paramMap", paramMap);

		return modelandView;
	}
}
