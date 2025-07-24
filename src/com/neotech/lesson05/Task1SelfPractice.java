package com.neotech.lesson05;

public class Task1SelfPractice {

	public static void main(String[] args) {

		
	byte date = 2;
	
	// Pattern 1: "Today is (weekdays) and we are working!"
	// Pattern 2: "We are on a break on Weekends."
	
	if (date == 1)
	{
		System.out.println("Today is Monday and we are workiing!");
	}
	
	else if(date == 2) 
	{
		System.out.println("Today is Tuesday and we are working.");
	}
	
	else if (date == 3)
		System.out.println("Today is Wednesday and we are working.");
	
	else if (date == 4)
	{ 
	    System.out.println("Today is Thursday and we are working.");	    
	}
	
	else if (date == 5)
	{
		System.out.println("Today is Friday and we are working.");
	}

	else
	{
	    System.out.println("We are on a break on Weekends!");
	}
	}
}
