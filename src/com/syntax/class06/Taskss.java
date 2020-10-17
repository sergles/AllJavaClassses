package com.syntax.class06;
import java.util.Scanner;
public class Taskss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//   THIS IS MY TRY
		//  Scanner scan = new Scanner(System.in);
		//  System.out.println("Please enter your grade");
		
		//  int grade = scan.nextInt();
		//  String grade;
		//  String A, B, C, D;
		//  switch (day) {
		//  case 1:
		//	grade = A;
		//  case 2:
		//	grade = B;
		//  case 3:
		//	grade = C;
		//  case 4:
		//  	grade = D;
		//  	default
		//  	grade = ("not acceptable");
		//  }
		
		
		
		
		// THIS IS COPY!!!
		
		Scanner scanner = new Scanner(System.in);
		char c;
		System.out.println("Enter your grade");
		c = scanner.next().charAt(0);
		switch (c) {
		case 'A':
			System.out.println("Exellent");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Everage");
			break;
		case 'D':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Not Acceptable");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
