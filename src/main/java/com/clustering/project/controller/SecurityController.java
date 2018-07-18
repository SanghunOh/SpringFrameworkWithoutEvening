/**
 * 
 */
package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
public class SecurityController {


	@RequestMapping(value = "/loginForm", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {

		String viewName = "loginForm";

		modelandView.setViewName(viewName);

		modelandView.addObject("resultMap", paramMap);
		return modelandView;
	}
/*
	@RequestMapping(value = {"/j_spring_security_logout"}, method = RequestMethod.GET)
	public String logout(Locale locale, Model model) {
		return "home";
	}
*/
}
