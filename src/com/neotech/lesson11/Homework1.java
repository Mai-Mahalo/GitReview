package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {
	
	//Homework 1:

	//Ask the user to enter an integer and build the following pattern:
	//Hint: Use scanner, if user entered number 5, there should be 5 rows.
	

	//In the second row, 1 spaces, (2 * 4) - 1 stars
	//In the third row, 2 spaces, (2 * 3) - 1 stars
	//In the fourth row, 3 spaces, (2 * 2) - 1 stars
	//In the fifth row, 4 spaces, (2 * 1) - 1 stars
	//
	//*********
	// *******
	//  *****
	//   ***
//	      *

	public static void main(String[] args) {
		// Lesson 11, Video Part 1, Beginning
		
		// Build with stars and spaces
		// Start with declaring scanner or building the shape
		
		
		// scan an int
		// create the outer loop = for running how many rows
		// create the innter loop = how many stars 
	
	// declare scanner
	Scanner scan = new Scanner(System.in);
	
	
	//Request users to enter info & scan an int
	System.out.println("Enter a number:");
	int num = scan.nextInt();
	
	//create the outer loop (= create rows)
	//1st step: creating line
	
	for(int i = 0; i < num; i++) {
		// the outer loop is responsible to create rows.
		// "int i = 0 means minimum number to run, if changed to "1",
		// and enter 1 for the question, it won't run.
		// int = 1 + i < num + i++ / entered 
	
		//create the inner loop = 
	for (int j = 0; j < i; j++) 
		// int j = 0; + if j < 5 = five stars or blank printed.
		// int j = 2 + if j < 5 = three stars or blank printed.
	{	
		System.out.print(" ");
	}	
	    for (int k = 0; k < 2 * (num - i) - 1; k++) 
	    //In the second row, 1 spaces, (2 * 4) - 1 stars
	    // 2 * ( num= if entered 5 - 0) - 1 = 9 stars
	    System.out.print("*");
	{
	    	 
	}
	   

		
		System.out.println();
		
		scan.close();
			
	}
	
	
}
	
	// Creating a new method (for Git review class)
	public static void newMethod() {
		
	}
	

	
}


	
	
    
	
	
	

		

	


