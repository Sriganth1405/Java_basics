package com.bridgelabz.day3;

public class Secondlargestelement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,9,6,7,8};
		
		int lar = arr[0];
		int sec = arr[0];
		for(int i=0; i<8;i++) {
			
			if(lar<arr[i]) {
				lar = arr[i];
			}
		}
		for(int i=0; i<8;i++) {
			
			if(arr[i] == lar) {
				continue;
			}
				
				if(sec<arr[i]) {
					sec = arr[i];
				}
		}
		System.out.println(sec);

		}}
