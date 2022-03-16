package com.maven;

public class MoodAnalyzer {

	String message;;

	/*
	 * we are converting the passing message to lower case and checking the contains
	 * happy or sad word and if happy and sad present then we can return values
	 * accordingly
	 */

	public String analyseMood(String message) {

		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else if (message.toLowerCase().contains("any")) {
			return "HAPPY";
		} else {
			return "Null";

		}
	}
}
