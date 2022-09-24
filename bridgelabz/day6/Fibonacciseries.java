package com.bridgelabz.day6;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner (System.in);
		int n1 = 0 ;
		int n2 = 1 ;
		int res;
		int N = in.nextInt();
		
		System.out.print(n1+" "+n2);
		
		for(int i=2 ;i<N;i++) {
			
			res = n1+n2;
			System.out.print(" "+res+" ");
			n1 = n2;
			n2 = res;
		}
		
	}

}
