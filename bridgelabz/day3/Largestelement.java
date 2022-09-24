package com.bridgelabz.day3;

public class Largestelement {

	public static void main(String[] args) {
	
		int arr[] = {12,2,3,4,8,9};
		int max = arr[0];
		
		  for(int i=0;i<6;i++) {
				
				if (max < arr[i]) {
					max = arr[i];
				
			}
		  }
		System.out.println(max);

	}

}
