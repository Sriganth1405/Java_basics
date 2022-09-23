package com.bridgelabz.day3;

import java.util.Scanner;

public class Duplicateofarray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,5,6,1,2,1,7};
		int count = 0;
		for(int j=0;j<8;j++) {
			
			
			for (int i=0;i<8;i++) {
				
				if(arr[j] == arr[i]) {
					count++;
					
					
				} 
				}if (count !=1) {
					System.out.println(arr[j]);
					//System.out.println(count);
					count =0;
			}

		}}}
