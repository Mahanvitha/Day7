package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.MyDate;
import com.capgemini.day7.java.PrintDateFormat;

class DateFormatTest {

	@Test
	void test() throws IOException {
		MyDate date1 = new MyDate("02121999");
		assertEquals("02/12/1999",PrintDateFormat.date(date1));
	}

}
