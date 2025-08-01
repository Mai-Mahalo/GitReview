package com.neotech.lesson08;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//increment ---> increase
		//Decrement ---> decrease
		
		int x = 5;
		
		x = x + 1; //update the value of x by adding 1 to it
		
		System.out.println(x);
		
		x += 1;  // += shorthand operator ---> x = x + 1
		
		System.out.println(x);
		
		x ++; // increment  --> add one to x and update its value;
		
		System.out.println(x);
		
		System.out.println("---------------------------");
		
		//Let's check out decrement --> decrease (subtract from the variable)
		int y = 10;
		
		System.out.println(y); // print the value of y
		
		System.out.println(y--); // = Display y first (y=10) then... decrement
		
		//The order of the operations matter for post-increment and pre-increment
		//In this case, we print first, then decrement by 1
		
		System.out.println(y);
		
		//Increment ---> Pre (++x, before the operation), Post (x++, after the operation)
		//Decrement ---> Pre (--x,before the operation), Post (x--,after the operation)
		
		System.out.println("------------------------------");
		
		int z = 10;  // assign 10 to z
		int w = z++; // 1. assign the value of z to w (10), then increment z by 1
		//"z++" is post increment
		
		System.out.println("z= " + z); // = z+1 = 11
		System.out.println("w= " + w); // assigned operation happened before "++" = just show 
		//value of z coz this is post increment
		
		System.out.println("----------------------------");
		
		int var1 = 5;
		int var2;
		
		System.out.println("var1 = " + var1);
		
		var2 = var1--;
		//This is what is going on step by step
		//1. var2 = var1 (since var1 at this point is 5, then var2 becomes 5)
		//2. var1 = var1 - 1 (--) --> var1 becomes 4
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		
		
		//watch Lesson 8, Part 2

	}

}
