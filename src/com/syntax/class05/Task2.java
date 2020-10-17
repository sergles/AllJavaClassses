package com.syntax.class05;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan;
	String  answer;
	double number;
	scan=new Scanner(System.in);
	System.out.println("How many years have you worked here?");
	int years = scan.nextInt();
	if(years>=5) {
	System.out.println("You are eligible for bonus. \n6What is your salary?");
	double salary = scan.nextDouble();
	if (salary>50000) {
		System.out.println("Your bonus is $5000");
	}else {
		System.out.println("Your bonus is $3000");
		}
	
	}else {
		System.out.println("You not eligible for bonus");
		}
		
		
	
		
		
		
	}

}
