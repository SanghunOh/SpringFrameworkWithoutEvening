package com.clustering.project;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
//@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<Object> resultList = new ArrayList<Object>();

		Map<String, Object> data01 = new HashMap<String, Object>();

		data01.put("MEMBER_ID", "103029301202");
		data01.put("NAME", "name 01");
		data01.put("CELLPHONE", "001-2930-2938");		
		data01.put("EMAIL", "Anders@gmail.com");		
		data01.put("COMMON_CODE_ID", "490293232849");
		data01.put("DESCRIPTION", "anything DESCRIPTION 01");
		data01.put("ORGANIZATION_SEQ", "UUID-00482983293");
		data01.put("TELEPHONE", "031-2930-3920");
		data01.put("ORDER_NUMBER", 1);
		resultList.add(data01);

		return "home";
	}
}
