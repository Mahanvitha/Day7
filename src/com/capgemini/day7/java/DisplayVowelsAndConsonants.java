package com.capgemini.day7.java;


import java.io.File;
import java.io.FileNotFoundException;

import java.util.*;

public class DisplayVowelsAndConsonants {
public static boolean vowelsAndConsonants(File file) throws FileNotFoundException {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the filename:");
    String fileName= sc.next();
    File file1 = new File(fileName);
	if (!file1.exists()) {
		System.out.println("The file " + fileName + " does not exist.");
		System.exit(1);
	}
    
 
	int vowels = 0;
	int consonants = 0;
	Set<Character> set = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));

	try ( Scanner inputFile = new Scanner(file1);) 
	{
		while (inputFile.hasNext()) {
			String line = inputFile.nextLine();
			for (int i = 0; i < line.length(); i++) {
				if (set.contains(Character.toUpperCase(line.charAt(i))))
					vowels++;
				else if (Character.isLetter(line.charAt(i)))
					consonants++;
			}
		}
	}


	System.out.println("The file " + fileName + " has " + vowels + 
		" vowels and " + consonants + " consonants.");
	return true;
}
}

