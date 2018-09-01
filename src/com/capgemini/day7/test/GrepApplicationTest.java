package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.GrepApplication;

class GrepApplicationTest {

	@Test
	void test() {
	File file = new File("C:\\javatestfiles\\GrepAPP.txt");
	assertEquals(true,GrepApplication.grep(file,"hh"));
	}

}
