package com.string;

//Write a function to reverse a string without using any built-in reverse function.

public class ReverseString {
	
	 public static void reverseString(String s)
	 {
		 String rev=" ";
		 
		 for(int i=s.length()-1;i>=0;i--) 
		 {
			  rev=rev+s.charAt(i);
		 }
		 
		 System.out.println(rev);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Java is object oriented programming language";
		reverseString(s);

	}

}
