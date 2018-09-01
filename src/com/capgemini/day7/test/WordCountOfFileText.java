package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.WordCount;
class WordCountOfFileText {

	@Test
	void test() {
		File file = new File("C:\\javatestfiles\\line count.txt");

		assertEquals(5,WordCount.words(file));
	}
}