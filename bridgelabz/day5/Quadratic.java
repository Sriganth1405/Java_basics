package com.bridgelabz.day5;

import java.util.Scanner;

public class Quadratic {

	static void Roots(int a , int b , int c ) {
		
	
	int delta = b*b - 4*a*c;
	
	int Root1 = (int) (-b + Math.sqrt(delta))/(2*a);
	int Root2 = (int) (-b - Math.sqrt(delta))/(2*a);


	System.out.println(Root1);
	System.out.println(Root2);
	}
	public static void main(String []args) {
		
		Scanner Input = new Scanner(System.in);
		
		
		int a = Input.nextInt();
		int b = Input.nextInt();
		int c = Input.nextInt();
		
		Roots(a, b, c);
	
		
		
	}
	
}
