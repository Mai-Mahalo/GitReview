package com.neotech.lesson03;

public class VariabeVarues {

	public static void main(String[] args) {
		
		
		//How do I declare variable?
		//Data Type  Variable Name/Identifier;
		
		// how about declaring and assigning?
		
		// Data Type        Name/Identifier      Assignment Op (=)        Value;
		
		byte a = 10;
		short b = 250;
		int c = 2500;
		long d = 2352312345L;
		
		float e = 25.5f;
		double f = 55.5;
		
		char g = '%';
		boolean h = false;
		
		//printing variables
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		
		//can I change the values of these parameters???
		//Yes, we call it reassigning!!!
		
		
		//we don't need to add the data type when reassigning. Java already knows it!!
		a = 25;
		b = 50;
		c = 35000;
		d = 12345678;
		e = 34543F;
		f = 5;
		g = '5'; // this is a character to Java
		h = true;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		

	}

}
