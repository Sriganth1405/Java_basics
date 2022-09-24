package com.bridgelabz.day5;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int N = Input.nextInt();
		float res = 0;
		for(float i=1;i<=N;i++) {
			
			 res = 1/i + res;
			
			System.out.println(res);
		}

	}

}
