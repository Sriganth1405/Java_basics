package com.bridgelabz.day5;

import java.util.Scanner;

public class Swapnumbers {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int a = Input.nextInt();
		int b = Input.nextInt();
		
		int temp =0;
		
		temp = b;
		b = a;
		a = temp;
		
		System.out.println("Swapped values : " + a +" " + b);
	}

}
