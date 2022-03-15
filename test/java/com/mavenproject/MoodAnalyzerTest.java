package com.mavenproject;

import org.junit.Assert;
import org.junit.Test;

import com.maven.MoodAnalyzer;

public class MoodAnalyzerTest {
	MoodAnalyzer moodanalyzer = new MoodAnalyzer();

	@Test
	public void Happymessage() {

		String result = moodanalyzer.analyseMood("i am in Happy Mood");

		Assert.assertEquals("HAPPY", result);
	}
}
