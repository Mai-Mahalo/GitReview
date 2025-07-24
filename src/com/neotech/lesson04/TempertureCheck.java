package com.neotech.lesson04;

public class TempertureCheck {

	public static void main(String[] args) {
		/*
		 * 2. Create a Java program and name it TemperatureCheck. Create a variable to
		 * store temperature. Your program should check if the temperature is below 32
		 * If the temperature is below 32 then it should print
		 * "Water will freeze with temperature __", otherwise should print
		 * "Water will NOT freeze with temperature __".
		 */
		
		int temp1 = 32;
		int temp2 = 40;
		
		if (temp1 >= temp2) {
			System.out.println("Water will freeze with temperature " + temp1 + ".");
			
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp1 + ".");
		}
		
		int temp3 = 22;
		int temp4 = 32;
		
		if (temp3 <= temp4)
		{
			System.out.println("Water will freeze with temperature " + temp4 + ".");
			
		} else {
			System.out.println("Water will NOT freeze with temperature " + temp4 + ".");
			
			
	}
		
	}
	
}
		
		
		




