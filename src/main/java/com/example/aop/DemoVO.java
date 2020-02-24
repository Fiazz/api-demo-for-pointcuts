package com.example.aop;

import lombok.Data;

@Data
public class DemoVO {
	private String deviceVersion;
	private String deviceOS;
	private String guid;
	private String userName;
}

// private static Pattern p = Pattern.compile("^[a-zA-Z]*$");
//
// public static boolean isAlpha(String s) {
// return p.matcher(s).find();
// }demoVO