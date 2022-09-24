package com.bridgelabz.day6;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int a=0;
		
         for (int num = Input.nextInt();num!=0;num = num/10) {
			
			 a = a*10+(num%10);
			
			
		}
		    System.out.println(a);
	}

}
