package com.neotech.lesson03;

public class Task1 {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and name it Task1 a) In your program create the
		 * variables to store student's information and then print the value of those
		 * variables: 
		 * - name 
		 * - lastName 
		 * - grade 
		 * - city 
		 * - state
		 * 
		 * b) Print the following: My name is ______ and my lastname is _____. I live in
		 * the city of _____, state of ____. My grade is: ____
		 */
		
		//a)
		
		String name = "Mai";
		String LastName = "Malanog";
		String grade = "I don't remember";
		String city = "Osaka";
		String country = "Japan" ;
		
		//b)
		//System.out.printIn ===> print the statement and hit Enter
		//System.out. orint ==> print the statement
		System.out.println("My name is " + name + " and my last name is " + LastName + ".");
		System.out.println("I live in the city of " + city + ", country of " + country + ".");
		System.out.println("My grade is that " + grade + ".");
		
		System.out.println("---------------------");
		
		// using  \n (new line character -- same as pressing ENTER key
		System.out.println("My name is " + name + " and my last name is " + LastName + ".\n"
				+ "I live in the city of " + city + ", country of " + country + ".\n"
				+ "My grade is that " + grade + ".\n");
		
		
		
				


	}

}
