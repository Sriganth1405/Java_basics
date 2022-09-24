package com.bridgelabz.day2;

import java.util.Scanner;

public class Tenhundred {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int number = Input.nextInt();
		
		if (number == 1) {
			
			System.out.println("One");
			
		}else if (number == 10) {
			
			System.out.println("Ten");
			
		}else if (number == 100) {
			System.out.println("Hundred");
			
		}else if (number == 1000) {
			
			System.out.println("Thousand");
		}else {
			System.out.println("Invalid");
		}

	}

}
 