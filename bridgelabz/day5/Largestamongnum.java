package com.bridgelabz.day5;

import java.util.Scanner;

public class Largestamongnum {

	public static void main(String[] args) {
		
		
		Scanner Input = new Scanner(System.in);
		
		
		int a, b,c;
		a = Input.nextInt();
		b = Input.nextInt();
		c = Input.nextInt();
		int m =0;
		
		if(a>b && a >c) {
			m = a;
			
		}else if (b>c) {
			m = b;
		}else {
			m =c;
		}


	System.out.println(m);

}}
