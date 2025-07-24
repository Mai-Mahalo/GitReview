package com.neotech.lesson02;

public class DeclareVariables {

	public static void main(String[] args) {
	
		/*
		 * 1. Create a Java Program (class) and name it DeclareVariables. Create
		 * variables for all 8 primitive Data Types (byte, short, int, long, float,
		 * double, char, boolean). I want you to print out each variable on a separate
		 * line. Try to assign a value outside its range (capacity).
		 */
		
		byte age = 127;
		System.out.println(age);
		
		short num = -32768;
		System.out.println(num);
		
		int num2 = 2147483647;
		System.out.println(num2);
		
		long num3 = 1234567890;
		System.out.println(num3);
		
		float num4 = 123.456789f;
		System.out.println(num4);
	
		double percentage = 300.5;
		System.out.println(percentage + "%");
		
		char pound = '#';
		System.out.println(pound);

		boolean good = true; 
		System.out.println(good);
				
		
	

	}

}
