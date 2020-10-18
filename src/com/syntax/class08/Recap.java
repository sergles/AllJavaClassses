package com.syntax.class08;
import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ask user to pay fpr water
		 * water price is $5
		 * once user enters money we need to tell if we need more more money or less
		 * once user gives exact 45 we will say "Enjoy your water"
		 */
		
     Scanner input;
     int money;
     int waterPrice=5;
     
     input=new Scanner(System.in);
     System.out.println("Please pay for water");
     money=input.nextInt();
     
     while(money!=waterPrice) {
    	 if(money<waterPrice) {
    		 System.out.println("Please pay more money"); 
    		 money=input.nextInt();
    	 }else {
    		 System.out.println("Please enter less money");
    		 money=input.nextInt();
    	 }
    	 
     }
     System.out.println("Enjoy your water");
     

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
