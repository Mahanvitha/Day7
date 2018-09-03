package com.capgemini.day7.java;

import java.time.LocalDate;

public class MagicDate {

	public String MagicDate(LocalDate date) {
		int month = (Integer)date.getMonthValue();
		int year = date.getYear();
		int day = date.getDayOfMonth();
		if((month*day)==year)
		{
			System.out.println(true);
		
			return "Magic date";
		}
		System.out.println(false);
		return"Not a magic date";
	}

}
