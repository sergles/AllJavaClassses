package com.syntax.class06;
import java.util.Scanner;
public class SwitcgDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * LETS ASK A TESTER WHICH BROWSWER THEY LIKE TO USE
		 * 
		 * 
		 */
		
		Scanner scan;
		String browser;
		String message;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter a browser");
		browser = scan.nextLine();
		
		switch (browser.toLowerCase()) {
		case "safari":
			message = "Your code will be executed on Safari browser";
			break;
		case "chrome":
			message = "Your code will be executed on Chrome browser";
			break;
		case "firefox":
			message = "Your code will be executed on Firegfox browser";
			break;
			default:
				message = "entered browser is not supported";
		}
		System.out.println(message);
		
		
		
		
		// switch case cannot use relational or logical operators
		// switch cannot work with double, float, long, boolean
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
