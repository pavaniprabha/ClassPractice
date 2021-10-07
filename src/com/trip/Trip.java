package com.trip;

import java.util.Scanner;

public class Trip {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 char ch = 'y';
		String name1 = "hyderabad";
		String name2 = "vizag";
		String name3 = "mumbai";
		String name4 = "tamilnadu";
		String name5 = "kerala";
		do {
		System.out.println("where you want to go for weekend?");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("i want to go " +name1);
			break;
		case 2:
			System.out.println("i want to go " +name2);
			break;
		case 3:
			System.out.println("i want to go " +name3);
			break;
		case 4:
			System.out.println("i want to go " +name4);
			break;	
		case 5:
			System.out.println("i want to go " +name5);
			break;
		default:
			System.out.println("what do u want to do");
		}
		 System.out.println("is there any change?");
		 ch = sc.next().charAt(0);
		 
		}
		while(ch == 'y' || ch == 'Y');
		System.out.println("i want to stay in my home");
		
		
		
		
		}


}
