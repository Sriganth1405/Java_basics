package com.bridgelabz.day5;

import java.util.Scanner;

public class Factorsofnumber {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int num = Input.nextInt();
		
		
		for(int i=1;i*i<=num;i++) {
			
		
		
		if (num%i==0) {
			System.out.println(i);
			System.out.println(num/i);
		}
		
		}
	}

}
