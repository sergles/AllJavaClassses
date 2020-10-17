package com.syntax.class05;
import java.util.Scanner;

public class TaskCass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan;
		String answer;
		double balance;
		scan=new Scanner(System.in);
		System.out.println("Do you have a credit card (true/false)");
		
		answer = scan.next();
		
		if(answer.equals("yes")) {
			System.out.println("What is the balance on your card");
			balance=scan.nextDouble();
			
			if(balance>1000) {
				System.out.println("Please pay off your balance");
		}else {
			System.out.println("You can spend more money");
		}
			}else {
				System.out.println("Would you like to get acredit card");
				
			}
		
		
		
		
		
		
		
		
	}

}
