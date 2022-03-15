package com.maven;

public class MoodAnalyzer {

	public String analyseMood(String message) {
		if (message.toLowerCase().contains("happy")) {
			return "HAPPY";
		} else if (message.toLowerCase().contains("sad")) {
			return "SAD";
		} else {
			return null;
		}
	}

	/*
	 * in this main method we created MoodAnalyser Object and called analyseMood
	 * method with passing parameters to print Happy and SAD mood
	 */

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyseMood("I am Happy");
		System.out.println(mood);
		mood = moodAnalyzer.analyseMood("I am Sad");
		System.out.println(mood);
	}
}