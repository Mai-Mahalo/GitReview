package com.neotech.lesson12;

public class Task2 {

//	Video, Lesson 12, Part 3-1
//	Homework 2:
//	Create an array on integers and calculate the sum of all elements in an array.
	
	public static void main(String[] args) {
		// x += y = x = x + y
		
		int[] numbers = {10, 15, 20, 30, 50}; // Array with index 0-4
		
		// 1st way: basic for loop
		
		int sum = 0; // We need it because we will calculate the numbers above.
		for(int i = 0; i < numbers.length; i++ ) {
			sum += numbers[i]; // sum = sum + numbers[i]
		}
		System.out.println("sum is " + sum);
		
		// 2nd way: advanced for loop
		int sum2 = 0;
		for (int number : numbers) {
			sum2 += number;
		}
		System.out.println("sum is " + sum2);
		
		// 3rd way
		int sum3 = 0;
		int i = 0;
		while (i < numbers.length) {
			sum3 += numbers[i]; // sum3 = sum3 + numbers[i]
			i++;	
		}
			System.out.println("sum is " + sum3);
			
		}
		
		
	

	}


