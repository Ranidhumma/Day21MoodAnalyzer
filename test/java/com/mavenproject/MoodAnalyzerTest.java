package com.mavenproject;

import org.junit.Assert;
import org.junit.Test;

import com.maven.MoodAnalyzer;

public class MoodAnalyzerTest {
	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void givenMsg_Proper_ShouldReturnSAD() {
		moodanalyzer.setMessage("I am in Sad Mood");
		String result = moodanalyzer.analyseMood();
		Assert.assertEquals("SAD", result);
	}

	@Test
	public void givenMsg_Proper_ShouldReturnHAPPY() {
		moodanalyzer.setMessage("I am in Happy Mood");
		String result = moodanalyzer.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}

	@Test
	public void givenMsg_Proper_AnyMood_ShouldReturnHAPPY() {
		moodanalyzer.setMessage("I am in Any Mood");
		String result = moodanalyzer.analyseMood();
		Assert.assertEquals("HAPPY", result);
	}

	/**
	 * we have created this method for null exception handling if message is not
	 * present then null value passed and it will give as Invalid mood
	 */
	@Test
	public void NullexceptionHadle() {
		moodanalyzer.setMessage(null);
		String result = moodanalyzer.analyseMood();
		Assert.assertEquals("Invalid Mood", result);
	}
}
