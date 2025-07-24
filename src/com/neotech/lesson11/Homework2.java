package com.neotech.lesson11;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
	//// Homework 2:
		//
		//Ask the user to enter an integer and build the following pattern:
		//Hint: Use scanner, if user entered number 5, there should be two parts
		//The first part, 1 to 5
		//The second part, 4 to 1
		//
		//1 
		//1 2 
		//1 2 3 
		//1 2 3 4 
		//1 2 3 4 5 
		//1 2 3 4 
		//1 2 3 
		//1 2 
		//1
		
		// Watch lesson 11, part 1
		
		// Step 1: Scanner for number
		// Step 2: Ask a number to the user, and scan int.
		// Step 3: Outer loop for the upper part
		// Step 4: Inner loop for the upper part
		// Step 5: Outer loop for the bottom part
		// Step 6: Inner loop for the bottom part
		
		// Assuming num is 5
		// In the first iteration (1st row): i = 1;, j = 1, how many times does the inner loop run? 1
		// In the second iteration (2nd row): i = 2, j = 1, 2 how many times does the inner loop run? 2
		// In the third iteration (3rd row): i = 3, j = 1, 2, 3 how many times does the inner loop run? 3
		
		// Step 1:
		Scanner scan = new Scanner (System.in);
		
		// Step 2:
		System.out.println("Enter the pattern size:");
		int num = scan.nextInt();
		
		// Step 3:
		for (int i = 1; i <= num; i++) 
		// i <= (number) = how many rows will be printed
		// int i = 1 because we want to start from 1st row.
		{
			for (int j = 1; j <= i; j++) // Columns
			// j < number -> How many numbers printing Eg: "if j < 3 = "333",
			// and "int j = 0"
			// "int j = 1" because we want to print starting from "1".
			{
				System.out.print(j + " ");
			}
			
				System.out.println();
//		        Example from Task 2 (L10)		
//				for (int i = 1; i <= 5; i++) {
//				for (int j = 1; j <=i; j++) {
//					System.out.print(i);
//					Print "i" to print numbers
		}	
		  // Step 4
		for (int i = num-1; i >= 1; i--) 
		// i < (number) = how many rows will be printed 
	    // num (if 5) - 1 = 4 rows due to the 2nd half will start 1 row shorter than the 1st half
		// copied the code exactly same from the 1st half from incrementing to decrementing
		{
		for (int j = 1; j <= i; j++) // Columns
	    // j < number -> How many numbers printing Eg: "if j < 3 = "333",
		// and "int j = 0"
		// "int j = 1" because we want to print starting from "1".
		{
		    System.out.print(j + " ");
		}
					
	     System.out.println();
		
	     scan.close();
	     }	
			
		}
		
	
	
	
	
	}
	
	

