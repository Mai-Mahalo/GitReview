package com.neotech.lesson10;

import java.util.Scanner;

public class Homework1ForLesson10 {
	
	
//Homework 1:

//Ask the user to enter an integer and build the following pattern:
//Hint: Use scanner, if user entered number 5, there should be 5 rows.
//In the first row, 0 spaces, (2 * 5) - 1 stars
//In the second row, 1 spaces, (2 * 4) - 1 stars
//In the third row, 2 spaces, (2 * 3) - 1 stars
//In the fourth row, 3 spaces, (2 * 2) - 1 stars
//In the fifth row, 4 spaces, (2 * 1) - 1 stars
//
//*********
// *******
//  *****
//   ***
//    *

	public static void main(String[] args) {
		
	// Scanner
	// Print the question
	// scanning number (Primitive + name -> can decide = input.nextInt();
	// For Loop for  "  "
	// Print * using the formula above
		//Eg: In the first row, 0 spaces, (2 * 5) - 1 stars
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number.");
	int number = input.nextInt();
	
	for(int a = 0; a <= number; a++) {
		for(int b = 0; b <= a; b++ ) {
			System.out.print(" ");
		}
	
	for(int c = (2* (number - a)) - 1; c > 0; c--) {
	// int c = 2 * (5 = number (if entered) - 0) - 1 = 9 
		// = Number of the stars in the first line
		System.out.print("*");
	}
	System.out.println();
	
		
		
		
		input.close();
	
			
		}
		
		
		
		
	
		
		
	}

}
