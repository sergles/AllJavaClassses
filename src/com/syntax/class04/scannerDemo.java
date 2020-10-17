package com.syntax.class04;

import java.util.Scanner;

//shortcut to import cmnd+shift+o


public class scannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=80;
	String str="I am a string";
	
	Scanner scan=new Scanner(System.in); //enable input to console
	String value=scan.nextLine(); //waits for your input and after that hit ENTER
    
	System.out.println("I captured String value = "+value);
	System.out.println("Please enter your name");
	String name=scan.nextLine();
	System.out.println("Nice to meet you "+name);
	
	
	
		
	}
}
