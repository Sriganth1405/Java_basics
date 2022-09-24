package com.bridgelabz.day2;

import java.util.Scanner;

public class Springseason {

	public static void main(String[] args) {
		
		
		Scanner Input = new Scanner(System.in);
		
		int mon = Input.nextInt();
		int day = Input.nextInt();
		
		
		if(mon >=3 && mon <=6) {
			System.out.println("Spring");
		}else if(mon ==3 && day > 20) {
		
			System.out.println("Spring");
				
		}
		else if(mon == 6 && day <20) {
			
			System.out.println("Spring");
	}	else 
		System.out.println("Not Spring");

}
}
