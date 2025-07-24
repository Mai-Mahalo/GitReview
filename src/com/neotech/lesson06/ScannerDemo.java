package com.neotech.lesson06;

import java.util.Scanner;

//import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// int age = 25;
		// System.out.println("your age is " + age);
		
		// Create a Scanner objeect from the Scanner Class
		Scanner input = new Scanner (System.in); // Left click "Scanner" to choose "import"
		// "input" above can be changed to any names
		
		//System.out.println("What is your full name?");
		//String fullName = input.nextLine();
		//System.out.println("Your full name is " + fullName);
		
		//"fullName" works if we moved up to the beginning.
		
		System.out.println("Enter your name");
		String name = input.next();
		//At the stage, they will print only my first name, they don't print after " " (space).
		System.out.println("Your name is " + name);
		
		System.out.println("How old are you?");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old!");
		
		System.out.println("What is your salary?");
		double salary = input.nextDouble();
		System.out.println("Your salary is " + salary);
		
		System.out.println("Are you happy? true/false");
		boolean happy = input.nextBoolean();
		System.out.println("Happy: " + happy);
		
		System.out.println("What is your full name?");
		String fullName = input.next() + " " + input.next();
		System.out.println("your full name is " + fullName);
		
		System.out.println("Enter your name and age:");
		name = input.next(); //Reassigned so no need variable
		age = input.nextInt();
		System.out.println("You are " + name + " and you are " + age + " years old!");
		

		
	
		
		
		

	}

}
