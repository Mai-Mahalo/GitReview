package com.neotech.lesson07;

import java.util.Scanner;

public class Hoemwork1 {

	public static void main(String[] args) {
		/*
		 * 1. Ask the user to enter the height in inches. Person should be classified as
		 * one of the following: 
		 * • short (under 60 inch) 
		 * • medium (between 60 -72 inch)
		 * • tall (over 72 inch)
		 */
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter your height in inches:");
	double height = input.nextDouble();
	
	if (height > 0 && height < 60) // want to start from zero (not minus)
	{
		System.out.println("Classied as SHORT!");
	}
	else if(height >=60 && height <72) // if the first condition is not true above
	{
		System.out.println("Classified as MEDIUM!");
	}
	else if(height >= 72)
	{
		System.out.println("Classified as TALL!");
	}
	else 
	{
	    System.out.println("Invalid Value");	
	}
	
	input.close();

	}

}
