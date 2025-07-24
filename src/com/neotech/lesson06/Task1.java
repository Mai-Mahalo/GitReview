package com.neotech.lesson06;

import java.util.Scanner;

public class Task1 {
	
// March 1, Lesson 6
	
	public static void main(String[] args) {
		// 1. Write a program that asks user to enter first name and then last name. At
		// the end system should display user's full name.
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = input.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastName = input.nextLine();
		
		System.out.println("Your full name is " + firstName + " " + lastName);
		
		input.close();
		

	}

}
