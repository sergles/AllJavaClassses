package com.syntax.class07;
import java.util.Scanner;
public class ScannerAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// ask user what is his name 5  times --> print hello +name
    // 
		
    Scanner scan;
	String name;
	
	scan=new Scanner(System.in);
	
	int number=1;
	while(number<=5) {
	  System.out.println("Tell me your name");
	  name=scan.nextLine();
	  System.out.println("Nice to meet you "+name);
	  number++;
	}
	
	System.out.println("---------------------------------");
	
	
	
	
	
	
	
	
	
	
	
	}

}
