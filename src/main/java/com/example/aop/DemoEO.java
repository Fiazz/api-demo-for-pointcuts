package com.example.aop;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DemoEO {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoEO.class);

	public DemoVO processResponse(DemoVO demoVO) {
		String guid = UUID.randomUUID().toString();
		LOGGER.info("Generated guid : {} for User : {}", guid, demoVO.getUserName());
		demoVO.setGuid(guid);
		return demoVO;
	}
}