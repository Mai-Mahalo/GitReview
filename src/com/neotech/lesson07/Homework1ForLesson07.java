package com.neotech.lesson07;

import java.util.Scanner;

public class Homework1ForLesson07 {

	public static void main(String[] args) {
	
    // Allow user to enter grade and then provide explanation: A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
    // At the end your program should print which grade was entered by the user with explanation.	
		
	Scanner input = new Scanner (System.in);
	System.out.println("Enter your grade.");
	
	String grade = input.nextLine();
	
	switch(grade) {
	case "A":
		System.out.println("You've entered A. This is Excellent");
		break;
	case "B":
		System.out.println("You've entered B. This is Good");
		break;
	case "C":
		System.out.println("You've entered C. This is Average");
		break;
	case "D":
	    System.out.println("You've entered D. This is Bad");
	    break;
	default:
		System.out.println("You've entered invailed info. This is Not Acceptable");
			
	input.close();
	
	
	}
	

	}

}
