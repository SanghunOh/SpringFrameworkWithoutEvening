/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.javabean.OrganizationBean;
import com.clustering.project.service.OrganizationService;

/**
 * @author ohsanghun
 * get it Mapping classlevel (JavaBean, HttpServletRequest, Model, View, ModelAndView)
 */

// ? delete @Controller, 
@Controller
@RequestMapping(value = "/organization")
public class OrganizationController {

	// ? add View class
	@RequestMapping(value = "/edit", method = { RequestMethod.GET, RequestMethod.POST })
	public Model edit(OrganizationBean paramMap, HttpServletRequest request, Model model) {
		
		model.addAttribute("resultMap", paramMap);
		
		return model;
	}

	
	// ? delete only method = RequestMethod.GET in @RequestMapping 
	@RequestMapping(value = "/read", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView read(OrganizationBean paramMap, ModelAndView modelandView) {
		
		String viewName = "/organization/read";

		OrganizationService service = new OrganizationService();
		
		Map<String, Object> resultMap = (Map<String, Object>) service.getObject(viewName, paramMap);

		modelandView.setViewName(viewName);

		modelandView.addObject("paramMap", paramMap);
		modelandView.addObject("resultMap", resultMap);
		
		return modelandView;

	}

	@Autowired
	private ApplicationContext _applicationContext;

	@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView list(@RequestParam Map<String, Object> paramMap, ModelAndView modelandView) {
		
		// withOut ContextLoaderListener
		OrganizationBean bean = (OrganizationBean) _applicationContext.getBean("organizationBean");

		// 
		OrganizationService service = (OrganizationService) _applicationContext.getBean("organizationService");

		String viewName = "/organization/list";

		List<Object> resultList = service.getList(viewName, paramMap);

		modelandView.setViewName(viewName);

		modelandView.addObject("resultList", resultList);
		
		return modelandView;

	}
}
