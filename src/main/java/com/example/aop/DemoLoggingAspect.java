package com.example.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoLoggingAspect {

	private static final Logger LOGGER = LoggerFactory.getLogger(DemoLoggingAspect.class);

	@AfterReturning(pointcut = "execution(* com.example.aop.DemoController.getResponse(..)) && args(..)", returning = "demoVO")
	public void myadvice(JoinPoint jp, DemoVO demoVO) {
		// Args in the order passed in the controller
		LOGGER.info(
				"Attempted /Portal login with request User Name : {}, User Guid : {} , Device Version : {} , OS : {}, Method : {} and Response is {}.",
				ToStringBuilder.reflectionToString(jp.getArgs()[4]), demoVO.getGuid(), jp.getArgs()[2], jp.getArgs()[3],
				((HttpServletRequest) jp.getArgs()[0]).getMethod(),
				((HttpServletResponse) jp.getArgs()[1]).getStatus());

	}
}
