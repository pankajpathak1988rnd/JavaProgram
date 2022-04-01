package com.java.programs;

import java.util.Arrays;

public class RandomJavaPractice {

	public static void main(String[] args) {
		
		
		String str1="abcd";
		String str2="bcda";
		
		
		char [] arrays1=str1.toLowerCase().toCharArray();
		char [] arrays2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(arrays1);
		Arrays.sort(arrays2);
		
		
		System.out.println(Arrays.equals(arrays1, arrays2));

	}

}
