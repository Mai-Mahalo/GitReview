package com.neotech.lesson13;

//Video Part 2-2

public class Task1 {
	
/*
* Create a 2D array of integer type with 3 rows and 4 columns and print all
* Print the of the numbers in the array.
*/

	//self practice
	public static void main(String[] args) {
		int num [][] = {
				{12, 34, 32, 54},
				{43, 14, 45, 76},
				{32, 65, 45, 87},
		};
		
		for (int row = 0; row < num.length; row++) {
			for (int col = 0; col < num [row].length; col++) {
				System.out.print(num[row][col] + " ");
				
			}
			
			System.out.println();
		}
			
	// In-class answer example
		
		int[][] numbers = {
				{2, 3, 5, 1}, {11, 9, 3, 4}, {8, 4, 2, 0} 
		};
		
		// basic for loop
		for (int row = 0; row < numbers.length; row++) {
			
			for (int col = 0; col < numbers[row].length; col++) {
				System.out.print(numbers[row][col] + " ");
			}
			
			System.out.println();
		}
		
		// advanced for loop
		for(int[]row : numbers) { // means "rows of the numbers"
			
			// this loop processes the elements of the row
			for(int col : row) {
				System.out.print(col + " ");
				
			}
			
		}
	
			
		}

	}


