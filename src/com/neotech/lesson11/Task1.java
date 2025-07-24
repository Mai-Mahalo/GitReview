package com.neotech.lesson11;

public class Task1 {
	
//	Create an array of chars and store grades into it: A,B,C,D,E,F. 
//	Then print a grade B (use 2 different ways of creating an array).
//
//	way 1: 
//			char[] grades = new char[6];
//			
//			grades[0] = 'A';....
//			
//
//	way 2: char[] grades2 = {'A', 'B'....};
	
	// Video part 3, Lesson 11

	public static void main(String[] args) {
	
		char[] grade1 = new char [6];
		
		grade1[0] = 'A';
		grade1[1] = 'B';
		grade1[2] = 'C';
		grade1[3] = 'D';
		grade1[4] = 'E';
		grade1[5] = 'F';
		
		System.out.println(grade1[1]);
		
		//2nd way:
//		way 2: char[] grades2 = {'A', 'B'....};
		char[] grade2 = {'A', 'B', 'C', 'D', 'E', 'F'}; // A=0 , B=1, C=2,...
		System.out.println(grade2[1]);

	}

}
