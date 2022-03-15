package com.mavenproject;

import org.junit.Assert;
import org.junit.Test;

import com.maven.MoodAnalyzer;

public class MoodAnalyzerTest {
	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void givenMsg_Proper_ShouldReturnSad() {

		String result = moodanalyzer.analyseMood("i am in Sad Mood");

		Assert.assertEquals("SAD", result);
	}

}
