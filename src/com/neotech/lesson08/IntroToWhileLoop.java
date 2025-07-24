package com.neotech.lesson08;

import java.util.Scanner;

public class IntroToWhileLoop {

	public static void main(String[] args) {
		
		int num = 11;
		
		// These execution of while loop follows these steps:
		   // 1. Check the loop condition (true or false)/If num is "11" then it is false. (due to "num < 11")
		        // if it is false, then skip the entire block
		        // if it is true, go inside the block, execute statements, then make sure to increment (change)
		                          // get back and check the condition again
		
		while(num < 11) //loop header - run the code in the body below while num is less than 11
		{
			System.out.println(num);
			// we must update the num so that the condition becomes false at some point (otherwise we go stuck on infinite loop).
			num++;
		}
		
		System.out.println("------------------");
		
		num = 1;
		while (num < 11) //condition is true
		{
			System.out.println(++num);
		}
		
		System.out.println("-----------------------");
		
		//how can I enter 5 numbers from the console using while loop?
		
		Scanner scan = new Scanner(System.in);
		int count = 1;
		
		while(count <= 5) 
		{
			System.out.println("Enter a number:");
			int var = scan.nextInt();
			
			System.out.println("You entered " + var);
			
			count++;
			
		//= we can enter whatever numbers maximum 5 times.
			
		}
		
		System.out.println("----------------");
		
		//2nd way:
		
		count = 5;
		while (count > 0) 
		{
			System.out.println("Enter a number:");
			int var = scan.nextInt();
			
			System.out.println("You entered " + var);
			
			count--;
		}
		
		
		
		
		
		// Watch Lesson 8, Part 3
		

	}

}
