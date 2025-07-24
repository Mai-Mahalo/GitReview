package com.neotech.lesson03;

public class StringExample {

	public static void main(String[] args) {
		
		//priitive data types:   dataTYpe   name  =  value;
		//non-primitive data types:  dataType   name  =value;
		
		int a;
		a = 10;
		
		int b = 15;
		char c = 'c';
		
		System.out.println(b);
		System.out.println(c);
		
		String schoolName = "NeoTech";
		String name = "John";
		byte age = 30;
		String income = "100k";
		String nationality =  "Albenian";
		
		System.out.println(schoolName);
		System.out.println(name);
		System.out.println(age);
		System.out.println(income);
		System.out.println(nationality);
		
		//can we reassign Strings?
		nationality = "Nigerian";
		System.out.println(nationality);
		

	}

}
