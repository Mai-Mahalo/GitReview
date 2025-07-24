package com.neotech.lesson08;

public class Task1 {
	  // Watch part 3, lesson 8.

	public static void main(String[] args) {
		// How can I print numbers from 50 to 1
		
	int x = 50;
	
	while(x > 0)
	{
		System.out.print(x + " ");
		x--;
	}
	 System.out.println(); // to make a new line
	 
	// Can we now write a loop to print ONLY EVEN numbers from 50 to 1
    //1st way: start with 50 (even) and then decrement by 2 - always go from even to the next even
	
	x = 50;
	
	while(x > 0) 
	{
		System.out.println(x + " ");
		x -=2; //x = x - 2, same as x--; x--;
	}
	
	 
	 
	 
	 
	}

}
