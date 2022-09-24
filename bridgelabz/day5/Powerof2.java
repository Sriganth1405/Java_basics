package com.bridgelabz.day5;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		int res=1;
		int num = Input.nextInt();
		
		for (int i=0;i<num&&num<31;i++) {
			
			 res = 2*res;
		
			System.out.println(res);
		}

	}

}
