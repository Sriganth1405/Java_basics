package com.bridgelabz.day1;

import java.util.Scanner;

public class Stringequals {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner (System.in);
		
		
		String a = Input.next();
		String b = Input.next();
		
		if (a.equalsIgnoreCase(b)) {
			System.out.println("Equal");}
		else {	
			System.out.println("not equal");
		}
	
	}
	

}
