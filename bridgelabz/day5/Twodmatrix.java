package com.bridgelabz.day5;

import java.util.Scanner;

public class Twodmatrix {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int[][]arr = new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[0].length;j++) {
				
				arr[i][j] = Input.nextInt();
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}}

}
