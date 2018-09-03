package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.MagicDate;

class MagicDateTest {

	@Test
	void test() {
		MagicDate Date =new MagicDate();
		assertEquals("Magic date",Date.MagicDate(LocalDate.of(60,4,15)));
	}
}
