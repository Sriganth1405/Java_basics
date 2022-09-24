package com.bridgelabz.day1;

public class StaticDemonstration {
	
	static int a = 10;
	
	
	static void print() {
		System.out.println("From static method");
	}
	
	static {
		System.out.println("From static block");
	}
	
	public static void main(String[] args) {
		
	
		 
		 
		System.out.println("static variable a = " +a);
		print();
	}

}
