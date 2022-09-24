package com.bridgelabz.day6;

import java.util.Random;
import java.util.Scanner;

public class Couponnumbers {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int N = in.nextInt();
		
		Random input = new Random();
		
		int[] arr = new int[N];
		
		int count = 0,i = 0;
		
		while(i < N) {
			int ran = input.nextInt(N+1);
			count++;
			int j = 0;
			for(j = 0;j < N;j++) {
				if(ran == arr[j]) {
					break;
				}
			}
			if(j == N) {
				arr[i] = ran;
				i++;
			}
		}
		
		System.out.println(count);

	}

}
