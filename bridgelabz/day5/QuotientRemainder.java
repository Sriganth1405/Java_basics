package com.bridgelabz.day5;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		
		Scanner Input = new Scanner(System.in);
		
		int a = Input.nextInt();
		int b = Input.nextInt();
		
	float q = a/b;
	int r = a%b;
		System.out.println("Quotient"+q);
		System.out.println("Remainder"+r);
	}

}
