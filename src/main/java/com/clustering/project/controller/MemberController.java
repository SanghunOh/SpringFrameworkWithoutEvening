/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	// ? add View class
	@RequestMapping(value = {"/edit","/read", "/list"}, method = { RequestMethod.GET, RequestMethod.POST })
	public void actionMethod() {
	}
}