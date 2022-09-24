package com.bridgelabz.day2;

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		char letter = Input.next().charAt(0);
		
		
		switch(letter) {
			
		case 'a':
			System.out.println("a is Vowel");
			break;
		case 'e':
			System.out.println("e is Vowel");
			break;
			
		case 'i':
			System.out.println("i is Vowel");
			break;
		case 'o':
			System.out.println("o is Vowel");
			break;
			
		case 'u':
			System.out.println("u is Vowel");
			break;
		default :
			System.out.println(letter +" is Consonant");
		
		}
		
		

	}

}
