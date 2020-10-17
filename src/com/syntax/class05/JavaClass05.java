package com.syntax.class05;
import java.util.Scanner;
public class JavaClass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*   Arithmetic +, -, *, /, %
		//    Relational <, >, >=, <=, ==, !=
		//	  Logical &&, ||
	
		//if (num>0) {
		//}
		
		//i need to define whether number than is entered from user is small, large and extra large
		
		//if number is > 1 but smaller than 10 -> small
		//if number is >11 but smaller yhan 100 -> number is big
		
		// AND (&&)
		//  if (true && true) -> TRUE
		//  if (true && false) -> FALSE
		//  if (true && true) -> FALSE
		//  if (false && false) -> FALSE
		
		// OR (||)
		
		
		
		
		
		
		
		Scanner input;
		int number;
		
		input=new Scanner(System.in);
		System.out.println("Please enter any number");
		number=input.nextInt();
		
		if (number>0 && number<=10) {
			System.out.println("you entered small number");
		}else if (number>10 && number<=100) {
			System.out.println("You entered medium number");
		}else if (number >100 && number<=1000) {
			System.out.println("You entered large number");
		}
		
		
	}

}
