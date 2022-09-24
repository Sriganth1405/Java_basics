package com.bridgelabz.day6;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int r = 0;
		for(int i=1;i<num;i++) {
			
			
			if(num%i==0) {
				//System.out.print(i+" ");
				r = r+i;
				System.out.print(r+" ");
			}}
			if(num == r) {
				System.out.println(r +" Perfect number ");
			}else {
				System.out.println("Not perfect number");
			}
				
				
		
		
		

	}

}
