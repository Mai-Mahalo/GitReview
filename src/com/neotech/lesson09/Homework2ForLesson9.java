package com.neotech.lesson09;

import java.util.Scanner;

public class Homework2ForLesson9 {

	// 2. Write a program that asks the user to enter his/her username and password 
	// until the user enters them correctly.
	
	public static void main(String[] args) {
		String username = "mai0207";
		String pw = "Aloha";
		Scanner input = new Scanner (System.in);
		String guessName;
		String guessPw;
		
		do {
			System.out.println("What is your username?");
			guessName = input.next();
			
			System.out.println("What is your password");
			guessPw = input.next();
		} while (!guessName.equals(username) && !guessPw.equals(pw));
		
		System.out.println("You got it!!!");
	
		input.close();
	}
	
	{
		
	
}
{		
		
			
		}
	

		
	{
		
	}
	
	{
		
	}

}
