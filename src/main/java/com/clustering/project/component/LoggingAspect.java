package com.clustering.project.component;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = Logger.getLogger(getClass());
	
	@Before(value="execution(* com.clustering.project.controller.*Controller.*(..))")
	public void log(JoinPoint joinPoint){
		logger.info("Entering " 
				+ joinPoint.getTarget().getClass().getSimpleName() +"'s"+ joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		for(int i=0; i<args.length; i++){
			logger.info("args["+ i +"] --> "+ args[i]);
		}
		
	}

}
