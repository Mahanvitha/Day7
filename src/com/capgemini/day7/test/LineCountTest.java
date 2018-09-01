package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.LineCount;

class LineCountTest {

	@Test
	void testLineCount() {
		File file = new File("C:\\javatestfiles\\line count.txt");
		assertEquals(5,LineCount.countLines(file));
	}
}
