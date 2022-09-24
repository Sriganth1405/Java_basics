package com.bridgelabz.day5;

import java.util.Random;

public class Leap_Year {

	public static void main(String args[]) {
		
		Random Input = new Random();
		
		int year = Input.nextInt(9000)+1000;
		
		System.out.println(year);
		
		if(year%4 == 0 && year%100 !=0 || year%400 == 0 ) {
		
		System.out.println("Leap year");
	   }else {
		   System.out.println("Not leap year");
		
		
	}
	
}}
