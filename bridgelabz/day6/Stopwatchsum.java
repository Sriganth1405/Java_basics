package com.bridgelabz.day6;

import java.util.Scanner;

public class Stopwatchsum {

	public static void main(String[] args) {
		
		int time =0;
		Scanner sc = new Scanner(System.in);
		int t = java.time.LocalTime.now().getSecond();
		
		sc.hasNext();
		System.out.println(java.time.LocalTime.now().getSecond() - t);

	}

}
