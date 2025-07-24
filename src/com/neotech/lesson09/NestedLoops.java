package com.neotech.lesson09;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) { // like a big wheel
			for (int j = 1; j <= 5; j++) // like a small wheel, runs more than bigger one
			{
		
		// Logic:
		// "int i = 1" (parents loop) goes to the child loop, then run five times.
		// After that the "int = 2" (added) will run 5 times.
				
		System.out.print(i);
			}
			
			System.out.println();
	}

	}
	
}


