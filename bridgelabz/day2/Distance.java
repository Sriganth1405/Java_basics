package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int x = Input.nextInt();
		int y = Input.nextInt();
		int distance;
		
		 distance = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 20));
		 
		 System.out.println(distance);
	}
	
}
