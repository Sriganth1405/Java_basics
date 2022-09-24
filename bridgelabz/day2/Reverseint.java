package com.bridgelabz.day2;

import java.util.Scanner;

public class Reverseint {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int number = Input.nextInt();
		
		int a=0;
		  while(number != 0){
			 a = a*10+(number%10);
			number = number/10;
		}
		 System.out.println(a);
	}

}
