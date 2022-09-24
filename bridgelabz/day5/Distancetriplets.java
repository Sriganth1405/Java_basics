package com.bridgelabz.day5;

import java.util.Scanner;

public class Distancetriplets {



	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int N= input.nextInt(); 
		int [] arr = new int[N];
		
		for(int i=0;i<N;i++) {
			
			arr[i] = input.nextInt();
			
			
			//System.out.println(arr[i]);
		}for (int j=0;j<=N-3;j++) {
			
			
		  int res = arr[j]+arr[j+1]+arr[j+2];
			
		  if(res ==0 ) {
			  System.out.print(arr[j]+" "+arr[j+1] +" "+arr[j+2]+"\n");
		  }
		}
		
	
	
		
		}
	}


