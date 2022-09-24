package com.bridgelabz.day5;

import java.util.Scanner;

public class Windchill {
	static void Wind(int v,int t) {
		
	
	double w = (35.74) +( 0.6215)*t + ((0.4275)*t) -(35.75) * Math.pow(v, 0.16);
	
	System.out.println(w);
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int v = input.nextInt();
		int t = input.nextInt();
		
		Wind(v,t);

	}

}
