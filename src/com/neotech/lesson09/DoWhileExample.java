package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		// ask user to guess your lucky number
		// lets pick 5 as our lucky number
		
		int luckyNumber = 5;
		Scanner scan = new Scanner(System.in);
		int userGuess;
		
//		do { 
	    //using "do" because we run sysout first, then scan user's input to tell
		//until the user entered the correct lucky number.
			
//		   System.out.println("What is my lucky number?");
//		   userGuess = scan.nextInt();
//		
//		} while(userGuess != luckyNumber); // != = Not equal to
		
		{ 
//		
//		System.out.println("You got it!!!"); 
		// Enter this after "{" because this is happening after the loop is done.
		
		//while loop solution
		
		System.out.println("What is my lucky number?");
		userGuess = scan.nextInt();
		
		while(userGuess != luckyNumber) {
			System.out.println("Nope, try again!");
			userGuess = scan.nextInt();
			
		}
		System.out.println("You got it!!!");
		
		scan.close();
		
		
		
		}

	}

}
