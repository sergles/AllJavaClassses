package com.syntax.class04;

import java.util.Scanner;

public class scannerDemo2 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in); // remember this line
		System.out.println("Please enter boolean for rain");
		
		boolean rain=input.nextBoolean(); //  i am waiting for your input, hit enter whn uou done
		
		if (rain) {
			System.out.println("Please take an umbrella");
			
		}else  {
			System.out.println("It is nice weather");
		}
		
		
		System.out.println("--------Lets capture integere value---------------");
		System.out.println("Please enter your name");
		String name =input.next();	
	    
		System.out.println("Please enter your age");
	    int age =input.nextInt();
		
		System.out.println("Your name is "+name+" you are "+age+" years old");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
