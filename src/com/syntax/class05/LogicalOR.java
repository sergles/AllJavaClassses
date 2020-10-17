package com.syntax.class05;

import java.util.Scanner;

public class LogicalOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day="Sunday";
		if (day.equals("Saturday") || day.equals("Sunday")) {
		System.out.println("Today i have a class at Syntax");
		}
		
		System.out.println("The end");
		System.out.println("-------------more examples----------------");
		
		/*
		 * if day is 1 or 5 -> I'm off from Syntax
		 * if day is 2 or 3 -> GIT classes
		 * if day is 4 -> review class
		 * if day 6 or 7 -> Java class
		 * everything else else will be invalid day
		 * 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter todays date using number only");
		
		int today=scan.nextInt();
		
		if(today==1 || today==5) {
			System.out.println("I am off from Syntax");
		}else if (today==2 || today==3) {
			System.out.print("Today is GIT class");
		}else if (today==4) {
			System.out.print("Today is Review class");
	    }else if (today==6 || today==7) {
		System.out.print("Today is Java class");
	    }else {
		System.out.println("Please enter a valid number from 1 to 7");
		
	}
	
		
		
		
		
		
		
		
	}

}
