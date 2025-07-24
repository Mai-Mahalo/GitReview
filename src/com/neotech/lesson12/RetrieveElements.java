package com.neotech.lesson12;

public class RetrieveElements {
	
//	Video, Lesson 12, part 2-1

	public static void main(String[] args) {
		
//		Refactor -> Rename variable
		
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		
		// how do we get the value of the array?
		
		// 1st way: for loop t
		for (int i = 0; i < grades.length; i++) { // will be an error with i <= grades.length
			if (i == grades.length - 1) { // true of last element
				System.out.print(grades[i]); // = to print the last index = 4
		// grade.length = 5 but index is 4 so "grades.length-1"
			} else { // true for other elements
				System.out.print(grades[i] + ", "); // to print the rest of values
			}
			
			
			}
		
		System.out.println();
		
		// 2nd way: advanced for loop
		for (char grade : grades) { //: = of
			System.out.print(grade + ", ");
		// can't remove the last ",".
			
		}
		
		System.out.println();
		
		
		String[] fruits = {"apple", "orange", "mango", "watermelon", "dragon"};
		
		// lets loop using basic for loop 
		// We want to say "Mango is my favorite" and printing other in order
		
		for (int i = 0; i < fruits.length; i++) {
			
			String fruit = fruits[i];
	     
			if(fruit.equals("mango")) {
				System.out.println(fruit + " is my favorite");
			} else {
				System.out.println(fruit);
				     						
			}
		
		}
		
		System.out.println();
		
		// lets do it using advanced for loop
		for (String fruit : fruits) {
			if(fruit.equals("mango")) {
				System.out.println(fruit + " is my favorite");
			} else {
				System.out.println(fruit);
				
			}
		
		}
		
	
	
	
			
	
			
	
		
		
	
	}
		
	    
	
	    
	

		}

	
