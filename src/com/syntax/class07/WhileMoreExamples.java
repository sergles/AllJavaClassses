package com.syntax.class07;

public class WhileMoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = "Saturday";
		if (day.equals("Saturday")) {
			System.out.println("My favorite Java class"); // 1 time
			}
		while(day.equals("Saturday")) {
			System.out.println("My favorite Java class"); // infinite times
		day="sunday";
		}
		
		
		System.out.println("____________________________");
		
		
		boolean ifItBreakTime=false;
		if (ifItBreakTime) {
			System.out.println("i will get tea"); // 1 time
			while (ifItBreakTime) {
				System.out.println("i will get tea"); // infinite times
				ifItBreakTime=false;
				}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
