package com.neotech.lesson07;

import java.util.Scanner;

public class HomeworkExtra {

	public static void main(String[] args) {
		// 3. F to C (temperture)
		
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter the city:");
	String city = input.nextLine();
	
	System.out.println("Please enter the temperature in Fahrenheit:");
	double fahrenheit = input.nextDouble();
	
	// converting f to c: c = (f-31)/1.8 or  / c = (f-32)*5/9
	double celcius = (fahrenheit - 32)/1.8;
	System.out.println("The temperature in " + city + " is " + celcius + "C!");
	
	
	input.close();
	
	

	}

}
