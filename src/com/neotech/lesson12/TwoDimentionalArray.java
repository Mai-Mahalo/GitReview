package com.neotech.lesson12;

public class TwoDimentionalArray {

//	Video, Lesson 12, Part 3-3
	
	public static void main(String[] args) {
		// More like an excel metrix
		// rows and columns
		
		int[][]numbers = new int [2][4]; 
		// 2 rows and 4 columns = 8 items, setting a size
//		** |----> COLUMN
//		** |
//		** ▼
//		** ROW
		
		//lets initiate the elements of the first row
		numbers [0][0] = 3; // 1st row / 1st column
		numbers [0][1] = 6;  
		numbers [0][2] = 1;
		numbers [0][3] = 7;
		
		//lets initialize the elements of the second row
		numbers [1][0] = 5;
		numbers [1][1] = 7;
		numbers [1][2] = 8;
		numbers [1][3] = 2;
		
		//how can I get the value of 8?
		System.out.println(numbers[1][2]);
		
		//New example
		int[][] number2 = {  // 3 rows & 3 column
				{1,2,3},
				{4,3,6},
				{7,8,3}
		};
		// or I can write like below.
		// int[][] number 2 = {{1,2,3}, {4,3,6}, {7,8,3}};
		
		// Write the value of 6
		System.out.println(number2[1][2]);
		
		// can I re-assign a value
		number2[0][1] = 99;
		
		// print it
		System.out.println(number2[0][1]);

	}

}
