package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.DisplayVowelsAndConsonants;

class VowelsAndConsonantsCount {

	@Test
	void test() throws FileNotFoundException {
		File file = new File("C:\\javatestfiles\\vowels.txt");
		assertEquals(true,DisplayVowelsAndConsonants.vowelsAndConsonants(file));
	}

}
