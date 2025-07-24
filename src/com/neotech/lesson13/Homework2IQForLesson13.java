package com.neotech.lesson13;

public class Homework2IQForLesson13 {
	
//	IQ
//
//	Write a java program to find the second largest number in the array?
//	Maximum and minimum number in the array?

	public static void main(String[] args) {
		
		int num[] = {92, 85, 78, 95, 103, 89, 90, 120, 94};
		
		
		// find the max number
		
		int max = num[0];
		for (int number : num) {
			if (number > max) {
				max = number;
			}
		}
		
		System.out.println("max is " + max);
		
		// do the same using for loop (max)
		int max2 = num[0];
		for(int i = 1; i < num.length; i++) {
			
			if (num[i] > max2) {
				max2 = num[i];
				
			}
			
		}
		
		System.out.println("max is " + max2);
		
		
		// Find minimum with advanced loop
		int min = num[0];
		for (int number2 : num) {
			if (number2 < min) {
				min = number2;
				
			}
				
			}
		
		System.out.println("The minmum is " + min);
		
		int sec = num[0];
		for (int number3 : num) {
			if (number3 >= sec && number3 < sec) {
				
			}
		
		}
		
		System.out.println("The second largest number is " + sec);
		
	}	
		
		}
	
				
		
	
			
		
				
		     
		    	 
		    	 
		    
		
		
		
		

	


