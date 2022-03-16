package com.maven;

public class MoodAnalyzer {

	String message;;

	/* getter setter created for string Message */
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/* default constructor */
	public MoodAnalyzer() {

	}

	/* Parameterized constructor */
	public MoodAnalyzer(String message) {
		this.message = message;

	}

	public String analyseMood() {
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
