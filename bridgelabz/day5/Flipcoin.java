package com.bridgelabz.day5;

import java.util.Random;
import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		int count = Input.nextInt();
		int heads =0,tails=0;
		
		Random input = new Random();
		
		
		
		for(int i =0;i<count;i++) {
			float ran = input.nextFloat(1);
			
		
		if(ran < 0.5) {
			System.out.println("Tails");
			tails++;
		}else {
			System.out.println("Heads");  
			heads++;
		}
		
	}int res = (heads*100)/count;
		System.out.println(res+"heads");
		 res = (tails*100)/count;
		System.out.println(res+"tails");
}}
