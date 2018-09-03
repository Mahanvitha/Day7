package com.capgemini.day7.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.java.Numbers;

class BinaryIOTest {

	@Test
	void test() {
		Random rnum = new Random();
		Integer num;
		File file = new File("C:\\javatestfiles\\test.txt");
		try (PrintWriter writer = new PrintWriter(file)) {
			for (Integer i = 0; i < 100; i++) {
				num = rnum.nextInt(50);
				writer.println(Integer.toBinaryString(num));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		TreeSet<Numbers> nums = new TreeSet<Numbers>();
		try(FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader))
		{
			String s;
			while ((s = reader.readLine()) != null) {
				int number=Integer.parseInt(s);
				nums.add(new Numbers(number));
			
			}
			for (Numbers numbers : nums) {
				System.out.println(numbers);
			}
		}	
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
