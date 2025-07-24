package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork2ForLesson6 {

//	2. Write a program that will ask for the day (a number from 1-7). Print whether it is a weekend or weekday.
//	If any day from 1-5 → output "It is a weekday"
//	Any day from 6-7 → output "It is a weekend",
//	Any other day → output "Invalid day"

	public static void main(String[] args) {
	
		Scanner date = new Scanner (System.in);
		
		System.out.println("What is the date today?");
		
		int w1 = date.nextInt();
		
		if(w1 >= 1 && w1 <=5)
		{
			System.out.println("It's a weekday.");
		}
		else if(w1 >= 6 && w1 <=7)
		{
			System.out.println("It's a weekend");
		}
		else 
		{
			System.out.println("Invalid day");
		}
		

	}

}
