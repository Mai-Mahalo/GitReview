package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2ForLesson10 {

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

	public static void main(String[] args) {
		// Scanner
		// Print the question
		// scanning number (Primitive + name -> can decide = input.nextInt();
		// For Loop for  "  "
		// Print 
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number between 1 and 5.");
	int answer = input.nextInt();
	
	// Upper part
	for (int a = 1; a <= answer; a++) {
		for (int b = 1; b <= a; b++) {
			System.out.print(b + " ");
		}
		System.out.println();
	}
    //Lower part
	for(int a = answer; a >= 1; a--) {
		for (int b = 1; b < a; b++)
			System.out.print(b + " ");
			
	input.close();
	
	}
	
	System.out.println();
	
	}
	


}
