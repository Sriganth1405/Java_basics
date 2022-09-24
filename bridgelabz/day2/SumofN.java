package com.bridgelabz.day2;

import java.util.Scanner;

public class SumofN {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		int N = Input.nextInt();
		
		int i = 1;
		int Nat = 0;
		while(i<=N) {
			
			
			Nat = Nat + i;
					i++;
		}
		System.out.println(Nat);
	}

}
