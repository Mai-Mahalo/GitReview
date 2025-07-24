package com.neotech.lesson06;

public class LogicalOR {

	public static void main(String[] args) {
		
		// Define an exam score
		// If the score is less than 0 or greater than 100, say "wrong score".
		// Maximum 100
		
		int score = 99;
		
		if (score < 0 || score > 100)
		{
		   System.out.println("Wrong score!!!");
		}
	    else 
	    {
	    	System.out.println("Your score is " + score);
		
	}
	}

}
