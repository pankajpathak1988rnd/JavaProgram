package com.java.programs;

import java.util.Scanner;

public class CapatalozedAllWordsInGivenString {

	public static void main(String[] args) {
		
		//Input--> hi how are you
		//Output-->Hi How Are You
		
		
		Scanner scn=new Scanner(System.in);
		
		String str=scn.nextLine();
		
		String strarray[]=str.split("\\s");
		String CapatilizedWords = "";
		
		for(String s:strarray){
			
			String first=s.substring(0, 1);
			String afterfirst=s.substring(1);
			
			CapatilizedWords+=first.toUpperCase()+afterfirst+" ";
				
			
		}
				
		System.out.println(CapatilizedWords.trim());
		
		
		
		scn.close();

	}

}
