package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		//data-type  name =  value
		
		//lets create an age variable
		byte age = 30;
		
		// not allowed since 128 is bigger than 127
		// byte age2 = 128;
		
		short cityCount = 15000;
		
		System.out.println(age);
		System.out.println(cityCount);
		
		// this works but you would be keeping a small value inside a big container
		int var1 = 5;
		
		// whie selecting data-type think about possible range
		long var2 = 12345678901L; // we can also use L at the end.
		
		System.out.println(var1);
		System.out.println(var2);
		
		// how to use decimal numbers?
		double var3 = 34.21; // numbers with digits are double by default
		float var4 = 56.99f; // we have to explicitly say that the number is a float by adding f at the end.
		
		System.out.println(var3);
		System.out.println(var4);
		
		char dollar = '$' ;  //Only one single item (including number and character, need to use ' ')
		char a = '1'; // the '1' is considered a character.
		char space = ' ';
		
		System.out.println(a * 5); // We can't do it because '1' is considered as a character.
		
		String b = "7"; // Also considered as a character, can't use in math operation
		
		//boolean is either true or false
		boolean pass = true;
		
		System.out.println(dollar);
		System.out.println(a);
		System.out.println(space);
		System.out.println(pass);
		
		char c = 34; //interesting,,,, strange
		System.out.println(c *2);

	}

}
