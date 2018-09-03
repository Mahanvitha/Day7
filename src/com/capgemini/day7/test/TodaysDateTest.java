package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.TodaysDate;

class TodaysDateTest {

	@Test
	void test() {
	
					assertEquals("SUNDAY, SEPTEMBER 2, 2018",TodaysDate.displayTodaysDate());
				}
}