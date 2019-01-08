package com.clustering.project.component;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = Logger.getLogger(getClass());
	
	@Before(value="execution(* com.clustering.project.controller.*Controller.*(..))")
	public void logBefore(JoinPoint joinPoint){
		logger.info("Before Entering " 
				+ joinPoint.getTarget().getClass().getSimpleName() +"'s"+ joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		for(int i=0; i<args.length; i++){
			logger.info("LoggingAspect Before args["+ i +"] --> "+ args[i]);
		}
		
	}

	@After(value="execution(* com.clustering.project.controller.*Controller.*(..))")
	public void logAfter(JoinPoint joinPoint){
		logger.info("After Entering " 
				+ joinPoint.getTarget().getClass().getSimpleName() +"'s"+ joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		for(int i=0; i<args.length; i++){
			logger.info("LoggingAspect After args["+ i +"] --> "+ args[i]);
		}
		
	}
}
