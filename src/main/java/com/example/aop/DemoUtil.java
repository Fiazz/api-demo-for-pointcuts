package com.example.aop;

import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

import com.example.aop.exception.DemoException;

import io.micrometer.core.instrument.util.StringUtils;

@Component
public class DemoUtil {
	private static Pattern p = Pattern.compile("^[0-9.]*$");

	public boolean validate(HttpServletRequest request, HttpServletResponse response, String deviceVersion) {
		if (StringUtils.isNotBlank(deviceVersion) && !p.matcher(deviceVersion).find()) {
			throw new DemoException();
		} else {
			return true;
		}
	}
}
