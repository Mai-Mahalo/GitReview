package com.neotech.lesson10;

public class Task3 {
	
	/*
	 
    *
   * *
  * * *
 * * * *
* * * * *
	 
	 */

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 4; j >= i; j--) {
				
				System.out.print(" ");
				
			}
			
		for (int k = 1; k <= i; k++) {
			System.out.print("* "); 
			// to make like a sample triangle
		}
			System.out.println();
			
		}

	}

}
