/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ohsanghun
 * get it Mapping classlevel (JavaBean, HttpServletRequest, Model, View, ModelAndView)
 */

//@Controller
public class ByPassController {

	// by pass URL class
	@RequestMapping(value = "/*/*")			//same thing 'value = "/**'  
	public void byPass() {
	}
}
