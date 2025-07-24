package com.neotech.lesson12;

public class Largest {
	
//	Video, Lesson 12, Part 4-2

	public static void main(String[] args) {

		
		
// find the max number in Array.
		
		
		// find the max number
		// Advanced loop
		int[] numbers = {2,6,33,1,99,12};
		
		int max = numbers[0];
		for (int number : numbers) {
			if (number > max) {
				max = number;
			}
		}
		 System.out.println("max is " + max);
		
		
        // do the same thing using basic for loop
        // Can start from 1
		 
		 int max2 = numbers[0];
		 for (int i = 1; i < numbers.length; i++) {
			 
			 if(numbers[i] > max2) {
				 max2 = numbers[i];
			 }
		 }
		 
		 System.out.println("max is " + max2);
		
        // task: find the second max
		
	}

}
