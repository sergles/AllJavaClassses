package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumberTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// play a lottery where we need to enter numbers from 1 to 20
		// lucky number is 7
		// keep asking to enter a number until they enter "lucky" number
		
		Scanner scan;
		
		int numberFromUser;
		
		int luckyNumber=7;
		
		scan=new Scanner(System.in);
		
		do {
			System.out.println("please enter any number from 1 to 20");
			numberFromUser=scan.nextInt();	
		
		}while(numberFromUser!=luckyNumber);
		System.out.print("You are the winner");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
