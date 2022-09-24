package com.bridgelabz.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int num = Input.nextInt();
		int a = 0;
		int b = num;
		while(num!=0) {
			
			a = a*10+(num%10);
			num = num/10;
		}
		
		System.out.println(a);
	    
	if(a == b) {
		System.out.println("Palindrome Number");
	}else {
		System.out.println("Not Palindrome");
		
	}
	}
}

