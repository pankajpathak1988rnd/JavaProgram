package com.java.programs;

import java.util.Arrays;
import java.util.Scanner;

public class ToCheckAnagramStrings {

	public static void main(String[] args) {

		// LISTEN and SILENT are anagram
		// abcd and dabc are anagram

		Scanner scn = new Scanner(System.in);

		String str1 = scn.nextLine();
		String str2 = scn.nextLine();

		if ((str1.length() != str2.length()) || (str1.equals(str2))) {
			System.out.println("String " + str1 + " and " + str2 + " are  not angram");

		} else {

			char str1Array[] = str1.toLowerCase().toCharArray();
			char str2Array[] = str2.toLowerCase().toCharArray();

			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			if(Arrays.equals(str1Array, str2Array))
				System.out.println("String " + str1 + " and " + str2 + " are  angram");
			else
				System.out.println("String " + str1 + " and " + str2 + " are  not angram");

		}


		scn.close();

	}

}
