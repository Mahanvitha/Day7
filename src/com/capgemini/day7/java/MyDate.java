package com.capgemini.day7.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.Serializable;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class MyDate implements Serializable {
	private LocalDate date;

	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyDate(LocalDate date) {
		super();
		this.date = date;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[" + date + "]";
	}
}
