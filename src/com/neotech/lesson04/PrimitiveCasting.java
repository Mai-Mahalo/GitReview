package com.neotech.lesson04;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		
		// type casting
		// byte --> short ---> int ---> long ---> float ---> double
		
		
		double d1 = 3.7; // no casting here
		System.out.println(d1);
		
		double d2 = 5; // casting happened from int to double
		System.out.println(d2); // Will show "5.0" = casting/converted
		
		//"int num = 5.5; //can't convert from double to int"
		// compile error
		
		// we are telling java to convert double into an integer.
		int num2 = (int) 6.5; // "(int)" = casting (not round up/down)
		System.out.println(num2);
		
		// You would likse the value here. It does not make any sense. Choose correct one like int. We shouldn't do it. 
		byte b1 = (byte) 4556; 
		System.out.println(b1);
		
		// No issues to be casting because byte can until 127
		int num3 = 50;
		byte b2 = (byte) num3;
		System.out.println(num3);
		
		//another narrowing example
		long L1 = 17L;
		int num4 = (int) L1;
		System.out.println(num4);
		
		long L2 = 123456789012345L;
		int num5 = (int) L2;
		System.out.println(num5);
		
		//another widening example
		int num6 = 250;
		float f1 = (float) num6;
		float f2 = num6;
		System.out.println(f1);
		System.out.println(f2);
		
		

	}

}
