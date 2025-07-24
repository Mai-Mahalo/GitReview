package com.neotech.lesson09;

import java.util.Scanner;

public class GuessMyName {

	public static void main(String[] args) {
		
		
		String myName = "Marissa";
		Scanner scan = new Scanner(System.in);
		String userGuess;
		
		do { 
	    //using "do" because we run sysout first, then scan user's input to tell
		//until the user entered the correct lucky number.
			
		   System.out.println("What is my name?");
		   userGuess = scan.next();
		
		} while(!userGuess.equals(myName)); // != = Not equal to
		
		{ 
		
		System.out.println("You got it!!!"); 
		// Enter this after "{" because this is happening after the loop is done.
		
		scan.close();
		
		}

	}

}
