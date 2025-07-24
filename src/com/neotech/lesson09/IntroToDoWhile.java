package com.neotech.lesson09;

public class IntroToDoWhile {

	public static void main(String[] args) {
		
		//while loop
		//check the condition first
		int num = 5;
		while (num < 10) { 
		//If the condition is true, run the while code,
		//othewwise quite the loop
			
			System.out.print(num + " ");
			//num = num + 1;
			//num += 1; shorthand
			num++;
			
		}
			System.out.println();
			
			System.out.println("-------------------------------");
		
	//do while loop (Check the condition later that is different from the previous one)
	//there is no initial condition to check
	//code will run at least once before the condition is checked
	//if condition is true, the loop code will run
	//otherwise it will quit
	
	int num2 = 5;		
	do {
		System.out.print(num2 + " "); // "5"(num2) must be shown first.
		num2++; // this is because we want to do increment
	} while (num2 < 10); //Stop until 10
	
	//the main difference between while loop and do-while loop is:
	//do-while  loop execute at least once where this is not the case for the while loop
	
	}
	
	
}
	
		
		
			
		
			
		
			
		
		

		



	