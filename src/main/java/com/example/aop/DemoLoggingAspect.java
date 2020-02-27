package com.example.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoLoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoLoggingAspect.class);

	// Common for success and failure
	private String requestBody = "";
	private String os = "";
	private String deviceVersion = "";
	private String requestMethod = "";

	@AfterReturning(pointcut = "execution(* com.example.aop.DemoController.*(..)) && args(..)", returning = "demoVO")
	public void myadvice(JoinPoint jp, DemoVO demoVO) {
		// DemoVO is your response object, from which info can be logged if any.
		LOGGER.info(
				"Attempted /invoke url with request User Name : {}, User Guid : {}, Device Version : {} , OS : {}, Method : {} and Response is {}.",
				requestBody, demoVO.getGuid(), deviceVersion, os, requestMethod,
				((HttpServletResponse) jp.getArgs()[1]).getStatus());
	}

	@Pointcut("execution(* com.example.aop.DemoController.*(..)) && args(..)")
	public void myBasePointcut() {

	}

	@After("myBasePointcut()")
	public void myBaseadvice(JoinPoint jp) {
		// Args in the order passed in the controller
		this.requestBody = ToStringBuilder.reflectionToString(jp.getArgs()[4], ToStringStyle.NO_CLASS_NAME_STYLE);
		this.deviceVersion = (String) jp.getArgs()[2];
		this.os = (String) jp.getArgs()[3];
		this.requestMethod = ((HttpServletRequest) jp.getArgs()[0]).getMethod();
	}

	@AfterReturning(pointcut = "execution(* com.example.aop.exception.handler.DemoExceptionHandler.*(..)) && args(..)", returning = "responseEntity")
	public void myExceptionadvice(JoinPoint jp, ResponseEntity<Object> responseEntity) {
		// Args in the order passed in the controller
		// To access error codes if any passed as arguments for error Handler use jp.getArgs()
		LOGGER.error(
				"Attempted /invoke url with request User Name : {}, Device Version : {} , OS : {}, Method : {} and Response is {}.",
				requestBody, deviceVersion, os, requestMethod, responseEntity.getStatusCodeValue());
	}
}
