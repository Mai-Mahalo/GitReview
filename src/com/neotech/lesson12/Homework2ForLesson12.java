package com.neotech.lesson12;

public class Homework2ForLesson12 {
	
//	2. Create a 2D array that first row will contain 4 names and second row will contain grades, all Strings.
//	Then you program should print name of the students that has A and B grade.

	public static void main(String[] args) {
		String[][]names = {{"Hanako","Taro","Yuko","Koji"}}; // Row = 0
		String[][]grades = {{"B", "B", "A", "B"}}; // Row = 0
		
		System.out.println("The grade of " + names[0][0] + " is " + grades[0][0]);
		System.out.println("The grade of " + names[0][1] + " is " + grades[0][1]);
		System.out.println("The grade of " + names[0][2] + " is " + grades[0][2]);
		System.out.println("The grade of " + names[0][3] + " is " + grades[0][3]);
		
		System.out.println("------------------------------");
		
		String[]names2 = {"Hanako","Taro","Yuko","Koji"};
		String[]grades2 = {"B", "B", "A", "B"}; 
		
		for (int i = 0; i < names2.length; i++) {
			System.out.println("The grade of " + names2[i] + " is " + grades2[i]);
			
		}
		
		

	}

}
