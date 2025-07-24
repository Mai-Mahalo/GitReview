package com.neotech.lesson12;

public class Recap {
	
	// Lesson 12, Video Part 1-1

	public static void main(String[] args) {
		
	// index no.2 = position 3
	// grade [1]  = value
	// Another way
		// String[] cities = {"XXXX", "YYYY"};
		
		// Declare
		int[]grades = new int[5]; // [0,0,0,0,0]
		
		// How can I get the size of this array?
		System.out.println("the size of the array is " + grades.length);
		
//		System.out.println("grade with index number 2 is " + grade[2]);
		
//		System.out.println("grade in position 3 is " + grade[2]);
		
		// 0 1 2 3 4 --> indexes
		// 0 0 0 0 0 --> values = position
		
		// lets change a grade: grades[3]
		grades[3] = 85;
		
		// grade[5] = 100; -> will give an error at runtime (we can still run it.)
		// grade[0] = "Ten" -> will give an error at compile (red mark pop up)
		
		grades[2] = 100;
		// 0 0 100 85 0
		
		grades[4] = 95;
		// 0 0 100 85 95
		
		grades[1] = 90;
		// 0 90 100 85 95
		
		grades[0] = 100;
		// 100 90 100 85 95
		
		grades[0] = 95;
		//Reassign
		
		grades[0] = 99;
		
		// 1st way:
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		int avg = total / 5;
		System.out.println("avg is " + avg);
		
		// 2nd way:
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			int grade = grades[i];
			sum += grade; // if x +=y means x= x + y
		}
		
		System.out.println("sum is " + sum);
		System.out.println("avg is " + sum / grades.length);
		
		String[] cities = {"Instabul", "Barcelona", "Houston", "Osaka", "Budapest", "Moscow"};
		
		System.out.println("there are " + cities.length + " cities");
		
		//print the last city
		System.out.println("THe last city is: " + cities[cities.length - 1]);
		//cities[5]
		
		//print the cities in order
		for (int i = 0; i < cities.length; i++) 
		{
		System.out.print(cities[i] + " ");	
		
		}
		
		System.out.println();
		
		// print the cities in reverse order
		// last index  = cities.length - 1
		
		for (int i = cities.length - 1; i >= 0; i-- ) {
			System.out.print(cities[i] + " ");
			
		}
		// "int i = cities.length-1 means that is the starting point for reverse order.
		// We have 6 cities but index starts from 0, so Moscow is index 5.
		// cities.length = 6 (position)  = index 5
		// i >= 0 is the ending point. = i (=5) >= 0 (=first index no)

	}

}
