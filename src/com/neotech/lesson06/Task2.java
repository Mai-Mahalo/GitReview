package com.neotech.lesson06;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// 2. Write a program that calculates the sum of two numbers entered by the
		// user. (No answer code in the document channel, need to do own.)
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter two numbers: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		
		int total = number1 + number2;
		
		System.out.println("The total number of " + number1 + " + " + number2 + " = " + total);
		
		
		

	}

}
