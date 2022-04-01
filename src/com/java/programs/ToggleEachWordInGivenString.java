package com.java.programs;

import java.util.Scanner;

public class ToggleEachWordInGivenString {

	public static void main(String[] args) {
		
		
		//Input-->this is javatpoint
		//Output-->tHIS iS jAVATPOINT	
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		String strarray[]=str.split("\\s");
		
		String ToggleWrodsString="";
		
		for(String S:strarray){
			
			String firstChar=S.substring(0, 1);
			String RestAllChar=S.substring(1);
			ToggleWrodsString+=firstChar.toLowerCase()+RestAllChar.toUpperCase()+" ";
			
				
		}
		 System.out.println(ToggleWrodsString.trim());	

	}

}
