package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
		//arithmetic operators
		
		//PEMDAS -> Parenthesis, Exp, Multiplication, Division, Addition, Subtraction
		
		int num1 = 5 + 5 + 5; //We usually calculate from the left
		System.out.println(num1);
		
		int num2 = 5 + 5 * 5; //They calculate from 5*5 first, then additional 5.
		System.out.println(num2);
		
		//lets print directly into the console
		System.out.println(5 * 5 + 5/5); //They calculate 5*5 -> 5/5 -> 25 + 1 = 26
		
		int number1 = 26532;
		int number2 = 256;
		
		// since div is an integer, the decimal will be dropped
		int div = number1 / number2;
		System.out.println("div ---> " + div);
		
		// 12 % 2 ---> 0(12 is fully divisible by 2 so the remainder is 0)
		// 15 % 2 ---> 1
		
		number1 = 25; //The "int number1 and number2" above will not be used for further calculation
		number2 =4;
		
		int rem = number1 % number2;
		System.out.println("rem ---> " + rem);
		
		System.out.println("Addition and Conatenation");
		
		int a = 10;
		int b = 10;
		
		String x = "Java";
		String y = "Tuesday";
		
		System.out.println(x + " " + y); // It shows Java Tuesday
		System.out.println(x + y + a); // It shows JavaTuesday10
		
		
		System.out.println(x + a + b);  //It shows Java1010
		System.out.println(x + (a + b));  //It shows Java20, They will do calculation if we have ().
		System.out.println("" + a + b);  //It shows  1010.
		System.out.println(a + b); // 20
		System.out.println(a + b + x + y); //20JavaTuesday, if starting with the number, they will do calculations
		System.out.println(x + y + a * b);  //JavaTuesday100
		System.out.println(x + y + a + b); //JavaTuesday1010
		
		// complication error
		// System.out.println(a * x); 
		
		// String + int --> String (Concatenation)
		// int + String  --> String (Concatenation)
		// int + int ---> int (Addition)
		// String * int --> error (Not allowed)
		
		System.out.println(""); // string but empty
		System.out.println(" "); // string, but its value one space (NOT empty)
		
		
		
	}

}
