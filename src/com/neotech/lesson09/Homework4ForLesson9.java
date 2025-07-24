package com.neotech.lesson09;

import java.util.Scanner;

public class Homework4ForLesson9 {

//	4. Create a program that will be asking the user to apply for a credit card 10 times.
//	As soon you get a "yes" from the user program should stop asking.

	public static void main(String[] args) {
		
		String no = "no";
		Scanner input = new Scanner (System.in);
		String answer;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Do you want apply for a credit card? (yes / no)");
			answer = input.next();
			
			if (answer.equals(no)) {
				break;
			
			
			}
			input.close();
			}
		}
		
		{
				}
			
			
		{		
	}
		
	}
		




