package com.neotech.lesson10;

public class Task2 {
//	1
//	22
//	333
//	4444
//	55555
//	4444
//	333
//	22
//	1

	public static void main(String[] args) {
		
		// for upper part of the pattern
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
				 //Print "i" to print numbers
			}
			
			System.out.println();
		}
		
		// for lower part of the pattern
		for (int i = 4; i >= 1; i--) {
			// "4" means starting printing from 4.
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			
			}
			System.out.println();
		}

			}

}
