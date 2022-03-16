package com.mavenproject;

import org.junit.Assert;
import org.junit.Test;

import com.maven.MoodAnalyzer;

public class MoodAnalyzerTest {
	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void givenMsg_Proper_ShouldReturnSAD() {

		String result = moodanalyzer.analyseMood("I am in Sad Mood");

		Assert.assertEquals("SAD", result);
	}

	@Test
	public void givenMsg_Proper_AnyMood_ShouldReturnHAPPY() {

		String result = moodanalyzer.analyseMood("I am in Any Mood");

		Assert.assertEquals("HAPPY", result);
	}
}
