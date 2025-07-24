package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
		
		int[] points = {90, 85, 75, 89, 95};
		
		//print elements one by pne
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		
		System.out.println("------------------------------");
		
		//first loop: i = 0, points[0]
		//second loop: i = 1, points [1]
		//third loop: i = 2, points [2]
		//fourth loop: i = 3, points [3]
		
		int size = points.length;
		
		for (int i = 0; i < size; i++)
		System.out.println(points[i] + " ");
		
		System.out.println();
		System.out.println("-----------------------");
		
		//how can we calculate the sum of all the points in the array?
		
		int sum = 0;
		
		for (int i = 0; i < size; i++) {
			
			sum += points[1]; //same as saying: sum = sum + points[i]
		}
		
		System.out.println("The total sum is: " + sum);
		System.out.println("The average point is: " + sum/size); //integer result
		System.out.println("The average point is: " + (double) sum/size);

	}

}
