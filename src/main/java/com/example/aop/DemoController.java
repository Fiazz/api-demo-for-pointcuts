package com.example.aop;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private DemoUtil util;

	@Autowired
	private DemoEO eo;

	@RequestMapping(value = "/portal", method = RequestMethod.POST, produces = "application/json")
	@ResponseBody
	public DemoVO getResponse(HttpServletRequest request, HttpServletResponse response,
			@RequestHeader("X-Device-Version") String deviceVersion, @RequestHeader("X-Device-OS") String deviceOS,
			@RequestBody DemoUserVO user) {
		DemoVO demoVO = new DemoVO();
		if (util.validate(request, response, deviceVersion)) {
			demoVO.setDeviceOS(deviceOS);
			demoVO.setDeviceVersion(deviceVersion);
			demoVO.setUserName(user.getUserName());
			response.setStatus(200);
			return eo.processResponse(demoVO);
		}
		return demoVO;
	}
}
