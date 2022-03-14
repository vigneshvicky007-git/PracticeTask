package com.logic.java;

public class LongestPalindromic {

	public static void main(String[] args) {
		 String inputString="theehtquickbrownfoxxofnworbquickkciuq";
		 
		 System.out.println(getLongestPalindrome(inputString)); 
			System.out.println(getLongestPalindrome(inputString).length()); 
//			System.out.println("Palindrome count is -"+inputString.length());
	}
	public static String getLongestPalindrome(String inputString) {
		
//		if (inputString.isEmpty()) 
//			return "a string";
		if (inputString.length()==1) 
			
			return inputString;
		
		String longest=inputString.substring(0,1);
		
		for (int i = 0; i <inputString.length(); i++) {
//	
//			odd checking
			String temp= checkEquality(inputString,i,i);
			
			if (longest.length()<temp.length()) {
				longest=temp;
			}
//			even checking
			temp=checkEquality(inputString,i,i+1);
			if (longest.length()<temp.length()) {
				longest=temp;
			}
		}
//		
//		
				return longest;
	}
	public static String checkEquality(String inputString,int begin,int end) {
		while (begin >=0 && end <= inputString.length()-1 && inputString.charAt(begin)==inputString.charAt(end)) {
				begin--;
				end++;
			
		}
		return inputString.substring(begin+1,end);
	}
}
