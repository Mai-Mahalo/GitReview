package com.neotech.lesson08;

import java.util.Scanner;

public class Homework2ForLesson8 {

	public static void main(String[] args) {
//		2. Write a program that asks user to enter his/her username and password 
//		until user enters them correctly.
		
		Scanner input = new Scanner(System.in);
		
		String name = "Mai0207";
		String password = "1234";
		boolean condition = true;
		
		while(condition) 
		{
			System.out.println("Enter your username and password:");
			String username = input.next();
			String pw = input.next();
			
			if(username.equals(name) && pw.equals(password)) 
			{
				System.out.println("Successful to log in!");
				break;
			}
			else 
			{
			System.out.println("Your username and/or password are invalid.");
			}
		}
		
			
		input.close();
		
		
		{
			
		}

	}

}
