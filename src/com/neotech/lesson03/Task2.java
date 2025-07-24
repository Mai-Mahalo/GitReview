package com.neotech.lesson03;

public class Task2 {

	public static void main(String[] args) {

		/*
		 * Create a new class named Task2
		 * 
		 * a) Write a program to print the area and perimeter of a rectangle with width
		 * = 5 and height = 8. Your program should say: "The perimeter of a rectangle
		 * with width ___ and height ___ is equal to ___ and the area is ___"
		 * 
		 * Area = width * height Perimeter = 2 * (width + height)
		 * 
		 * 
		 * My answer below wihtout watching an answer
		 */
		
		int width, height, perimeter, area;
		
		width = 5;
		height = 8;
		perimeter = 2* + (width + height);
		area = width * height;
		
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimeter + " and the area is " + area + ".\n");
		
		//Answer from the instructor
		
		int w, h, a, p;
		w = 5;
		h = 8;
		
		a = w * h;
		System.out.println("Area is " + a);
		
		p = 2* + (w + h);
		System.out.println("Perimeter is " + p);
		
		
		System.out.println("The perimeter of a rectangle with width " + w + " and height " + h + " is equal to " + p + " and the area is " + a + ".\n");
		
		
	}

}
