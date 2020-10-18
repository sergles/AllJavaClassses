package com.syntax.class08;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		
		
		int a;
		for(a=1; a<6; a++) {
			System.out.println("value for A inside the loop "+a);
		}
		System.out.println("The value for a outside For Loop" +a);
		
		
		int result=1;
		for (int w=10; w>=1; w-=2) {
			result*=w;
		 System.out.println("Result "+result);
		}
		
		
		// calculate the sum of even and odd numbers from 1 to 50
		
		int sum=0;
		
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				sum+=i;
			}
	}System.out.println(sum);
	

		int sumOdd=0;
		 for(int i=1; i<=50; i++) {
			 if (i%2==1) {
				 sumOdd+=i;
			 } 
		 }System.out.println(sumOdd);
		
		
		
	}

}
