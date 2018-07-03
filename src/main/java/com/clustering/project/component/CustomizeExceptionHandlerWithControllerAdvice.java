package com.clustering.project.component;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

//@ControllerAdvice
public class CustomizeExceptionHandlerWithControllerAdvice {

	public static final String DEFAULT_ERROR_VIEW = "/home";

	// @ExceptionHandler(value = { HttpRequestMethodNotSupportedException.class,
	// IllegalArgumentException.class, IllegalStateException.class, SQLException.class })
//	@ExceptionHandler(value = { NoHandlerFoundException.class, Exception.class })
	@ExceptionHandler(value = { RuntimeException.class })
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception exception) throws Exception {
		// If the exception is annotated with @ResponseStatus rethrow it and let
		// the framework handle it - like the OrderNotFoundException example
		// at the start of this post.
		// AnnotationUtils is a Spring Framework utility class.
		if (AnnotationUtils.findAnnotation(exception.getClass(), ResponseStatus.class) != null)
			throw exception;

		// Otherwise setup and send the user to a default error-view.
		ModelAndView mav = new ModelAndView();
		mav.addObject("exception", exception);
		mav.addObject("url", request.getRequestURL());
		mav.setViewName(DEFAULT_ERROR_VIEW);
		// HttpStatus status = errorView.status();
		// model.addObject("statusValue", status.value());
		// model.addObject("statusStr", status.getReasonPhrase());
		// setting status code
		// response.setStatus(status.value());
		return mav;
	}
}
