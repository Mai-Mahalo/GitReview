package com.neotech.lesson05;

public class Homework2 {

	public static void main(String[] args) {
		/*
		 * 2. Create a Java program and name it TemperatureCheck. Create a variable to
		 * store temperature. Your program should check if the temperature is below 32
		 * If the temperature is below 32 then it should print
		 * "Water will freeze with temperature __", otherwise should print
		 * "Water will NOT freeze with temperature __".
		 */
		 
		// To make "*/", type / + * + Enter 
		
		double temp =31; //widening int ---> double 
		// Using double because we may want to see more accurate answer in the end with decimal. Float is ok.
		
		//if statements are used for the selective execution = 
		//if   (true)  - temp <32 whatever the condition is
		       //this will happen
		//else
		       // this code will execute
		
		//if I ask you: is 9 > 6? Yes or No = boolean expression
		// To make "if form", if + ( + enter (moved to the next line) + { + enter
		// To make "else form" else + { + Enter -> move the { to the next line to see easier.
		 //boolean expression ---> an expression where the result is boolean
		if(temp < 32)
		{
			System.out.println("Water will freeze with temperature " + temp + ".");
		}
		else 
		{
			System.out.println("Water will  will NOT freeze with temperature " + temp + ".");
		}
	        
	}	
        //syntax:
		
		// if (expression)
		// {
		     //if body --- code goes here...
		//  }
		// else
		// {
		     //else body ---- code goes here...
		//}
}
