package com.syntax.class06;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, max;
		Scanner scanner = null;
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		num3 = scanner.nextDouble();
		scanner.close();
		
		//1st way
		if (num1 > num2 && num1> num3) {
			max = num1;
		}else if (num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		System.out.println(max);
		
		double biggest;
		
		System.out.println ("--------Comparing 2 numbers using nested if--------");
		
		
		//2nd way
		if (num1>num2) { //if number 1 larger than number 2
			if (num2>num2) {
				biggest=(int) num1;
			}else {
				biggest=(int) num3;
			}
		}else {//number 2 is larger than number 1
			if (num2>num3) {
				biggest=(int) num2;
			}else {
				biggest=(int) num3;
			
			System.out.println("The largest number is "+biggest);
			
			
			
			
			}		
			
	}

	}
	}
