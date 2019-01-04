/**
 * 
 */
package com.clustering.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ohsanghun
 *
 */
@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

	// ? add View class
	@RequestMapping(value = "/edit", method = { RequestMethod.GET, RequestMethod.POST })
	public void edit() {
	}

	
	// ? delete only method = RequestMethod.GET in @RequestMapping 
	@RequestMapping(value = "/read", method = { RequestMethod.GET, RequestMethod.POST })
	public void read() {

	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public void list() {
	}
}
