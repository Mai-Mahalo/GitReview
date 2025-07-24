package com.neotech.lesson08;

class PreAndPostIncrement {

	public static void main(String[] args) {
		
		// ++ --> increment --> add 1 to the variable
		// -- --> decrement --> subtract 1 from the variable
		
//		--------------Difference bwtween x and  -------------------
		
		int x;
		int y = 20;
		
		x = y++;
		// post increment:
		// (1) x = y (x = 20)
		// (2) y = y + 1; (y = 21)
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("--------------------");
		
		int a;
		int b = 20;
		
		a = ++b;
		
		//in two lines this would be:
		//b = b + 1;
		//a = b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("------------------------------");
		
//		--------------Difference between x and  -------------------
		
		int c;
		int d = 5;
		
		System.out.println(--d);
		//decrement is happening (d = d-1)
		//operation is happening (printing)
		
		c = --d; //post decrement
		// step 1: d = d - 1
		// step 2: c = d;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		c = d--; // post decrement
		// step 1: c = d (3)
		// step 2: d = d - 1 (3-1=2)
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
	

	}

}
