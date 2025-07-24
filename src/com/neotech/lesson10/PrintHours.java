package com.neotech.lesson10;

public class PrintHours {
	
	// Print the whole combination of hours in a digital clock
	// 00:00
	// ...
	// 23:59
	
	// Lesson 10, Part 2

	public static void main(String[] args) {
		
		for (int hour = 0; hour <= 23; hour++) {
			if(hour < 10) { //coz we want to "0" to show like 01:01.
				System.out.println("0" + hour + ":");
			} // convert one digit number to two digits
			else {
				System.out.println(hour + ":");
			}
			
		    }
            
		    // fix the preceding 0 issue for min.
		    
		
		
		
		
		}
		
		
		

	}

