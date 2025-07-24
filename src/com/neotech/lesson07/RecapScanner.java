package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {
	
	// This has been added by Elion. (For Git Review class)

	public static void main(String[] args) {
		// type name = value
		// int a = 5;
		
		// Cmd + Shift + o (To add "import java.util.Scanner;")
		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter your name, age, salary, and gender:");
		String name = input.next();
		int age = input.nextInt();
		double salary = input.nextDouble();
		char gender = input.next().charAt(0);
		
		System.out.println("Your info is " + name + " " + age + " " + " " + salary + " " + gender);
		
		//InputMismatchException - entered value does not match the expected type
				
		
	    input.close();
	    
	    	
	    }
	
	public void method2() { // This is for Git Review class
		
		
				
		

	}

}
