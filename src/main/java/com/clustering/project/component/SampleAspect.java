package com.clustering.project.component;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
//@Component
public class SampleAspect {
	private Logger logger = Logger.getLogger(getClass());
	
	public void log(JoinPoint joinPoint){
	}

}
