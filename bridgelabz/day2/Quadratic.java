package com.bridgelabz.day2;

import java.util.Scanner;


public class Quadratic {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int a = Input.nextInt();
		int b = Input.nextInt();
		int c = Input.nextInt();
		int delta , Root1,Root2;
		
		delta = b*b - 4*a*c;
		
		Root1 = (int) (-b + Math.sqrt(delta))/(2*a);
		Root2 = (int) (-b - Math.sqrt(delta))/(2*a);

	
		System.out.println(Root1);
		System.out.println(Root2);
}
	

}
