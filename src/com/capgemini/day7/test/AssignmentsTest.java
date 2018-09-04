package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.Assignments;

class AssignmentsTest {

	@Test
	void test() {
		Assignments assign1 = new Assignments(new File("C:\\javatestfiles\\test.txt"), LocalDate.of(2014, 9, 25));
		Assignments assign2 = new Assignments(new File("C:\\javatestfiles\\test.txt"), LocalDate.of(2014, 9, 24));
		Assignments assign3 = new Assignments(new File("C:\\javatestfiles\\test.txt"), LocalDate.of(2014, 9, 18));
		Assignments assign4 = new Assignments(new File("C:\\javatestfiles\\test.txt"), LocalDate.of(2014, 9, 20));
		assertEquals(true, Assignments.add(assign1));
		assertEquals(true, Assignments.add(assign2));
		assertEquals(true, Assignments.add(assign3));
		assertEquals(true, Assignments.add(assign4));
		assertEquals(true, Assignments.remove(assign1));
		
		Assignments.show();
		System.out.println("\n");
		
		
		assertEquals(assign3, Assignments.search());
		
	}
	}


