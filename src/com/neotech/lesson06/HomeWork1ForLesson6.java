package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork1ForLesson6 {
	
	/*
	 * 1. Ask the user to enter the height in inches. Person should be classified as
	 * one of the following: 
	 * • short (under 60 inch) 
	 * • medium (between 60 -72 inch)
	 * • tall (over 72 inch)
	 */

	public static void main(String[] args) {
		
		Scanner tall = new Scanner (System.in);
		
		System.out.println("Enter your height.");
		int height = tall.nextInt();
		
		if(height < 60)
		{
			System.out.println("Your height is short.");
		}
		else if(height > 60 && height < 72) 
		{
		    System.out.println("Your height is medium.");	
		}
		else 
		{
		     System.out.println("Your height is tall.");	
		}
		{
			
		}
		
		
		
		

	}

}
