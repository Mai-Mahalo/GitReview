package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra1ForLesson7 {

	public static void main(String[] args) {
//		EXTRA: Write a program that lets user to enter apple,dell,acer laptop models;
//		 ◆ If it is apple show "Apple-no virus"
//		 ◆ If it is dell show "Tough one"
//		 ◆ If it is acer show "Cheap one"
//		 ◆Else "do not buy that one!"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter which laptop models you want to buy. Staring with a small letter.");
		
		String laptop = scan.nextLine();
		
		switch(laptop) {
		case "apple":
			System.out.println("Apple-no virus");
			break;
		
		case "dell":
			System.out.println("Tough one");
			break;
		
		case "acer":
			System.out.println("Cheap one");
			break;
			
		default:
			System.out.println("Do not buy that one!");
	
		
		}
		
		
		scan.close();
		


	}

}
