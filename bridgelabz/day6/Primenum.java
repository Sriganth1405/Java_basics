package com.bridgelabz.day6;

import java.util.Scanner;

public class Primenum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
	    int num = in.nextInt();
		int i=2;
				
		while(i<num) {
			
			if(num%i== 0) {
				System.out.println("Not Prime");
				break;
			}
				i++;
		}
			 if(i==num) {
					
					System.out.println("Prime");
				}
			
		
		
		
	}
	}


