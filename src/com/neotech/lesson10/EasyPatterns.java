package com.neotech.lesson10;

public class EasyPatterns {
	
	// *****
	// ****
	// ***
	// **
	// *

	public static void main(String[] args) 
{
	
		for (int i = 1; i <= 5; i++) { // for print five starts
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 3; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 2; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int i = 1; i <= 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		// lets find a smarter solution
		for (int i = 1; i <= 5; i++) { // Parent decided how many times to run
		// After child ran, "int i" will be 2
			
			for(int j = 5; j >= i; j--) {// decrementing from 5 to 1
				System.out.print("*"); // child will run
			 // if i =1,  print 5 times (i <= 5)
			 // "j = 5" = start from print five stars
			
			
			}
			System.out.println();
		}

	}

}
