package com.bridgelabz.day3;

public class MinimumElement {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,-4,8,9};
		int min = arr[0];
		
		  for(int i=0;i<6;i++) {
				
				if (min > arr[i]) {
					min = arr[i];
				
			}
		  }
		System.out.println(min);

	}

}
