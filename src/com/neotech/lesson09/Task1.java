package com.neotech.lesson09;

public class Task1 {

	public static void main(String[] args) {
		
		// Print numbers from 1 to 100 in 1 line with space.
		
		for (int i = 1; i <= 100; i++) { 
			//int i = 1 means starting point, i <= 100 means ending point, i++ = increasing one by one
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("");
		
		// Print numbers from 100 to 1.
		for (int i = 100; i >= 1; i--  ) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		System.out.println("");
		
		// Print even number from 20 to 1 (2 ways)
		for (int i = 20; i >= 1; i-=2) {
			System.out.print(i + " ");
		}
		
		//2nd way
		for (int i = 20; i >= 1; i--) {
			if (i %2 == 0) { // 0 is going to give even numbers, 1 give odd numbers
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("------------------------");
		System.out.println();
		
		// Print odd numbers between 20 and 50. (2 ways)
		for (int n = 21; n <= 50; n+=2) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//2nd way
		for (int n = 21; n <= 50; n++) {
			if (n %2 == 1) { // 0 is going to give even numbers, 1 give odd numbers
				System.out.print(n + " ");
			}
		}
	}
	}


