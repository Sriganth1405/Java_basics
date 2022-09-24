package com.bridgelabz.day2;

import java.util.Scanner;

public class Minandmax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		
		int b = input.nextInt();
		
		int c = input.nextInt();
		
		int d,e,f,g;

         d = a+b*c;
         e = c+a/b;
         f = a%b+c;
         g = a*b+c;
         
         int max = Math.max(d, Math.max(e,Math.max(f, g)));
         int min = Math.min(d, Math.min(e, Math.min(f, g)));
         
         System.out.println(max + " " + min);
}
}