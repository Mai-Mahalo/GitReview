package com.neotech.lesson06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// 3. Write a program that asks user to enter two numbers and prints which one is larger.
		
		//We need to have a Scanner object
		//We also need to have two (let say) int. numbers
		//Finally, we should write an if or if=else or if else if statement structure
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter the first number.");
		int num1 = scan.nextInt(); 
		//nextInt because we use "Int". It can be "nextBoolean" if we choose Boolean
		
		System.out.println("Enter the second number.");
		int num2 = scan.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1 + " is bigger than " + num2);
		}
		else if(num1 < num2)
		{
			System.out.println(num2 + " is greater than " + num1);
		}
		else {
			System.out.println("Both numbers are the same.");
		}
		scan.close();
		

	}

}
