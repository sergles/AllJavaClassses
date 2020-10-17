package com.syntax.class04;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we need to compare 2 number
		// bigger, smaller or equal
		
		
		int num1=99;
		int num2=99;
		if (num1>num2) {
			System.out.print(num1+" is bigger than "+num2);
			}else if (num1<num2) {
				System.out.println(num1+" is smaller than "+num2);
			}else {
				System.out.println(num1+" is equal to "+num2);
			}
		
		
		/*  Based on the day of the week, we will print class schedule
		 *
		 *
		 */
		      int month=13;
		      if(month==1) {
			System.out.println("January");
			} else if (month==2) {
				System.out.print("February");
			} else if (month==3) {
				System.out.println("March");
			} else if (month==4) {
			    System.out.println("April");
			} else if (month==5) {
				System.out.println("May"); 
			} else if (month==6) {
				System.out.println("June");
			} else if (month==7) {
				System.out.print("July");
			} else if (month==8) {
			    System.out.println("August");
			} else if (month==9) {
				System.out.println("September"); 
			} else if (month==10) {
				System.out.println("November");
			} else if (month==11) {
				System.out.print("October");
			} else if (month==12) {
				System.out.print("December");
			} else {
				System.out.println("Invalid month");
				}
			
		int number=-1;
		if(number<0) {
			System.out.println("The number is negative"); 
		}else if (number>0) {
			System.out.println("The number is positive");
		} 
		
		
		int x=9;
		int y=x%2;
		if (y==0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
			}
		
		
		
	}

}
