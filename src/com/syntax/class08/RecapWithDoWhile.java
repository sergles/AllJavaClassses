package com.syntax.class08;
import java.util.Scanner;
public class RecapWithDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input;
	     int money;
	     int waterPrice=5;
	     
	     input=new Scanner(System.in);
	     System.out.println("Please pay for water");
	    
		
	     do {
	    	 money=input.nextInt();
	    	 if(money<waterPrice) {
	    		 System.out.println("Please pay more money"); 
	    	 }else if (money>waterPrice) {
	    		 System.out.println("Please enter less money");
	    	 } //money=input.nextInt();
	    	 
	     } while (money!=waterPrice);
		
		System.out.println("Please enjoy your water");
		
		
		
		
		
		
		
	}

}
