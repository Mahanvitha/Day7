package com.capgemini.day7.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GrepApplication {

	public static boolean grep(File file, String string) {
		int lineCount = 0;
		try (FileReader fileReader = new FileReader(file); BufferedReader reader = new BufferedReader(fileReader);) {
			String s = null;
			while ((s = reader.readLine()) != null) {
				if (!s.equals("")) {
					lineCount++;
					String[] words = s.split(" ");
					for(int i=0;i<words.length;i++)
					{
					if(words[i].equals(string))
					{
						System.out.println(lineCount+" "+s);
					break;
				}
					}
				}
			}
	
} catch (IOException e) {
	e.printStackTrace();
}
	return true;
}

}