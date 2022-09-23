package com.bridgelabz.day3;

public class Sortelements {

	public static void main(String[] args) {
		
		int arr[] = {9,2,7,0,5,4,8,1};
		int m = arr[0];
		int temp=0;
		for(int i=0;i<7;i++) {
			
			for(int j=0;j<7;j++) {
				
			
				if (arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i < 8;i++) {
			System.out.println(arr[i]);
		}

	}

}
