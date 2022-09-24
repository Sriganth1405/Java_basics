package com.bridgelabz.day5;

import java.util.Scanner;

public class Vowelorconsonant {

	public static void main(String[] args) {
		
		
		Scanner Input = new Scanner(System.in);
		
		String c = Input.next().toLowerCase();
			
		if (c.equals("a") || c.equals("e") || c.equals("o") ||c.equals("i") || c.equals("u")) {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
