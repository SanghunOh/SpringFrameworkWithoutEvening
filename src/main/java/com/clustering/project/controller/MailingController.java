/**
 * It's Designed For incubation Center
 * @author ohsanghun
 * @version     %I%, %G%
 * @since       1.0
 */
package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.service.MailService;
import com.clustering.project.service.MemberService;
import com.clustering.project.util.CommonUtil;

@Controller
public class MailingController {
	private final static String MAPPING = "/mailing/";
	
	@Autowired
	private MailService mailService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private CommonUtil commonUtil;

	@RequestMapping(value = MAPPING+"{action}", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView actionMethod(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {

		String viewName = MAPPING + action ;
		Map<String, Object> resultMap = new HashMap<String, Object>() ;
		List<Object> resultList = new ArrayList<Object>();

		String resultCode = "";
		// check to send email or not
		if ("sendSingleMail".equals(action)) { // try to send
			resultCode = mailService.sendMail(paramMap);

		} else if ("sendMultiMail".equals(action)) { // try to send
			
			resultList = (List<Object>) memberService.getList(paramMap);

			Map<Object, Object> dataMap = null;

			Iterator<?> itr = resultList.iterator();

			// as if up to two email
			while (itr.hasNext()) {
				dataMap = (Map<Object, Object>) itr.next();
				dataMap.put("FROMEMAIL", paramMap.get("FROMEMAIL"));
				dataMap.put("SUBJECT", paramMap.get("SUBJECT"));
				dataMap.put("MESSAGE", commonUtil.getMessageFromFile());

				resultCode = mailService.sendMail(dataMap);
			}

		}

		resultMap.put("resultCode", resultCode);
		
		viewName = MAPPING + "send"; 
				
		modelandView.addObject("resultList", resultList);
		modelandView.addObject("resultMap", resultMap);
		modelandView.addObject("paramMap", paramMap);
		modelandView.setViewName(viewName);
		return modelandView;
	}
	
}