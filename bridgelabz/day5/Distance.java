package com.bridgelabz.day5;

import java.util.Scanner;

public class Distance {
	
	static void distance(int x,int y) {
		int distance = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		 
		 System.out.println(distance);
	}
	public static void main(String[] args) {
		
Scanner Input = new Scanner(System.in);
		
		int x = Input.nextInt();
		int y = Input.nextInt();
		
		
		distance(x,y);
		
	


	}

}
