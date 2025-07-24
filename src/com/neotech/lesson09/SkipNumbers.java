package com.neotech.lesson09;

public class SkipNumbers {

	public static void main(String[] args) {
		
		// print number from 1 to ten, skip number 3, 6 and 9
		
		for (int i = 1; i <= 10; i++) {
			if (i == 3 || i == 6 || i == 9) {
				continue;
			}
			
		if (i %3 == 0) {
			continue;
		}
			System.out.print(i + " ");
		}
		System.out.println();
		
		// print all the numbers between 20 and 40
		// skip the numbers from 27 to 33
		
		for (int i = 20; i <=40; i++) {
			if (i >= 27 && i <= 33) {
				continue;
			}
			
			System.out.print(i + " ");
		}
	
		
		}
		

	}
