package com.neotech.lesson12;

public class TwoDimensionalArrayLength {
	
//	Video, Lesson 12, Part 4-1

	public static void main(String[] args) {
	 
	// "month[0]" = 1st row
		
		String[][] months = {{"December", "January", "February"}, 
				             {"March", "April", "May"},
				             {"June", "July", "August"},
				             {"September", "October", "November"}}; // 4 rows + 3 columns
		
		// lets get the number of rows
		int rows = months.length;
		System.out.println("rows: " + rows);
		
		int columnInFirstRow = months[0].length; // "0" is first index = first row.
		System.out.println("first row has " + columnInFirstRow + " elements");
		
		// print the number of elements in second row
		System.out.println(months[1].length); // months[1] = [1] = 2nd row
		
		// can we loop over the elements of a 2 dimensional array
		for (int i = 0; i < months.length; i++) { // "i" represents rows
			String[] season = months[i];
			
			for (String month : season) {
				System.out.println(month + " ");
			}
			System.out.println();
		}

	}

}
