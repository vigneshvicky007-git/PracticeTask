package com.logic.java;

public class Permutations {

	public static void main(String[] args) {
		 printPermutationOfStrings("PQR");
	 }
	  
	 private static void printPermutationOfStrings(String str){
	  printPermutation(str, "");
	 }
	  
	 private static void printPermutation(String str, String stringToPrint){
	  if(stringToPrint.length()==str.length()){
	   System.out.println(stringToPrint);
//	   System.out.println(stringToPrint.length());
	   return;
	  }
	  for (int i = 0; i < str.length(); i++) {
	   printPermutation(str, stringToPrint + str.charAt(i));
	  }

}
}

