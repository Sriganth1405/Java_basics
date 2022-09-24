package com.bridgelabz.day1;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int leapYear = sc.nextInt();
		
		if(leapYear >= 1582 && leapYear%4 == 0 && leapYear%100 != 0 || leapYear%400 == 0 ) {
			
			System.out.println("Leap Year");
		}else {
			System.out.println("Not Leap Year");
			
			
		}

	}

}
