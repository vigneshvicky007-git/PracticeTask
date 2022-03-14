package com.logic.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Scanner;

public class LongestWordInTextFile {

	 public static void main(String [ ] args) throws FileNotFoundException {
		    new LongestWordInTextFile().getLongestWords();
		 }

		public String getLongestWords() throws FileNotFoundException {

		    String longestWord = "";
		    String current;
		    Scanner scan = new Scanner(new File("C:\\Users\\HP\\Documents\\longestword.txt"));


		    while (scan.hasNext()) {
		        current = scan.next();
		        if (current.length() > longestWord.length()) {
		            longestWord = current;
		        }

		    }
		    System.out.println(longestWord);
		    System.out.println(longestWord.length());
		            return longestWord;
		        }
}
