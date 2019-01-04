/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ohsanghun
 * get it Mapping classlevel (JavaBean, HttpServletRequest, Model, View, ModelAndView)
 */

// ? delete @Controller, 
@Controller
public class OrganizationController {

	// ? add View class
	@RequestMapping(value = "/organization/edit")
	public void edit() {
	}

	
	// ? delete only method = RequestMethod.GET in @RequestMapping 
	@RequestMapping(value = "/organization/read")
	public void read() {

	}

	@RequestMapping(value = "/organization/list")
	public void list() {
	}
}
