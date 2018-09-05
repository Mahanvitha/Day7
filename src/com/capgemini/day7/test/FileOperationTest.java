package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.FileOperation;

class FileOperationTest {
			@Test
			void testReverse() {
				assertEquals(true, FileOperation.reverse("C:\\javatestfiles\\FileOpeartions.txt",
						"C:\\javatestfiles\\FileTest.txt"));

				assertEquals(true, FileOperation.convert("C:\\javatestfiles\\convert.txt",
						"C:\\javatestfiles\\convertTest.txt"));

				assertEquals(true, FileOperation.compare("C:\\javatestfiles\\reverse.txt",
						"C:\\javatestfiles\\reverseTest.txt"));

			

}
}
