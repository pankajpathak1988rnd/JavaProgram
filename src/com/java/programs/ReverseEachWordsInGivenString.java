package com.java.programs;

import java.util.Scanner;

public class ReverseEachWordsInGivenString {

	public static void main(String[] args) {
		
		//Input---> hi how are you
		//Output-->ih woh era uoy
		
		
		
		Scanner scn=new Scanner(System.in);
		
		String str=scn.nextLine();
		
		String strarray[]=str.split("\\s");
		
	
		String revword1="";
		for(String S:strarray){
			
			StringBuilder sb=new StringBuilder(S);
			StringBuilder revSbstr=sb.reverse();
			String revword=revSbstr.toString();		
			revword1+=revword+" ";
			
		}
		
		System.out.println(revword1.trim());
		
		scn.close();
	}

}
