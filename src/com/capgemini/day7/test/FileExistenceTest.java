package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistenceTest {

	@Test
	void testExistenceOfFile() {
		File file = new File("C:\\Users\\omahanvi\\Documents\\workspace-sts-3.9.5.RELEASE\\Day7 ");
		assertEquals(true,file.exists());
		
	}

}
