package com.mycompany.camel.regex;

import java.util.ArrayList;
import java.util.List;

public class ValidateDemo {
	public static void main(String[] args) {
		List<String> input = new ArrayList<String>();
		input.add("Textbox1,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		input.add("Report Date  11/05/2016,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		input.add(",,,,,,,,,,,,,,,,,,,,,,,,,,");
		input.add("SiteCode,Site_Description,SiteModulesComplted,");
		input.add(",,,,,,,,,,,,,,,,,,,,,,,,,,,");
		input.add("textbox");


		for (String testMatcher : input) {
			if (testMatcher.matches("[a-z].*")) {
				System.out.println("Found good matcher: " + testMatcher);
			}
		}
	}
}
