package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String answer;
		
		for (int i = 1; i <= 10; i++) { 
			// we can use for as long as we have condition, increment and decrement
			System.out.println("Would you like to apply for a credit card? (Yes or No)");
			answer = scan.next();
			
			if (answer.equalsIgnoreCase("yes")) { //yes, Yes, YES //IgnoreCase
				System.out.println("Perfect, let's start");
				break;
				
			}
		}
		
		scan.close();
		

	}

}
