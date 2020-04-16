package com.java.maven;

import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {

		String str = "Silas Caimi";
		System.out.println(StringUtils.abbreviate(str, 10));

	}

}
