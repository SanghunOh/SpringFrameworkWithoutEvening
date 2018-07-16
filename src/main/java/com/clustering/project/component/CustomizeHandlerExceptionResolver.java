package com.clustering.project.component;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite;
import org.springframework.web.servlet.view.RedirectView;

public class CustomizeHandlerExceptionResolver extends HandlerExceptionResolverComposite {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception exception) {
		super.resolveException(request, response, handler, exception);
//        if (handler instanceof HandlerMethod) {
//            HandlerMethod hm = (HandlerMethod) handler;
//            ErrorView errorView = hm.getMethodAnnotation(ErrorView.class);
//            if (errorView != null) {
                //preparing ModelAndView
//                String viewName = errorView.value();
				String viewName = "/exception/handlerexception";
                ModelAndView modelAndView = new ModelAndView();
        		modelAndView.setViewName(viewName);

                Map<String, Object> errorMessageMap = new HashMap<String, Object>() ;
        		errorMessageMap.put("requestUri", request.getRequestURI());
        		errorMessageMap.put("errorTitle", exception.getCause());
        		errorMessageMap.put("errorMessage", exception.getMessage());

        		modelAndView.addObject("errorMessageMap", errorMessageMap);

//                HttpStatus status = errorView.status();
//                model.addObject("statusValue", status.value());
//                model.addObject("statusStr", status.getReasonPhrase());

                return modelAndView;
//            }
//        }
//        return null;
	}
}
