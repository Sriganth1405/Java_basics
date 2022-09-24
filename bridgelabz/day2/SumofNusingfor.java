package com.bridgelabz.day2;

import java.util.Scanner;

public class SumofNusingfor {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int N = Input.nextInt();
		
		int Nat = 0;
		
		for(int i =0;i<=N;i++) {
			
			Nat = Nat + i;
		}
		
		System.out.print(Nat);

	}

}
