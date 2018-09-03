package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.MyDate;
import com.capgemini.day7.java.MyDateFormat;


class DateFormatTest {

	@Test
	void test() throws IOException {
		
		assertEquals("2/12/1999;2 December,1999",MyDateFormat.formatChange("02121999"));
	}

}
