package com.java.programs;

import java.util.Scanner;

public class ReveresToggleEachWordInGivenString2 {

	public static void main(String[] args) {
		
		
		//Input-->this is javatpoint
		//Output-->sIHT sI tNIOPTAVAJ	
		
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		
		String strarray[]=str.split("\\s");
		
		String RevToggleWrodsString="";
		
		for(String S:strarray){
			
			StringBuilder sb=new StringBuilder(S);
		    StringBuilder revSBstr=sb.reverse();
		    String revstr=revSBstr.toString();
		    
		    String FirstCharofRevString=revstr.substring(0, 1);
		    String RestCharOfRevString=revstr.substring(1);
		    
		    RevToggleWrodsString+=FirstCharofRevString.toLowerCase()+RestCharOfRevString.toUpperCase()+" ";
		    
			
			
		}
		 System.out.println(RevToggleWrodsString.trim());	

	}

}
