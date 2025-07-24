package com.neotech.lesson04;

public class Homework {

	public static void main(String[] args) {
		
		// Homework 3 (answer)
		
		double scale = 1.609344;
				
		double km, mile; 
		
		//convert miles to km
		mile = 5;
		km = mile * scale;
		
		System.out.println(mile + " mile is " + km + " kilometers");
		
		System.out.println("------------------");
		
		km = 60;
		mile = km / scale;
		
		System.out.println(km + " kilometers is " + mile + " miles");
				
		

	}

}
