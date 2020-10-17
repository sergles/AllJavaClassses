package com.syntax.class02;

public class StringCon {

	public static void main(String[] args) {
		
		
	String name= "Olga";
	//i would like to say my name
	System.out.println("My name is " +name);
		
	String lastName="Sorrels";
	//i would like to print Olga Sorrels
	System.out.println(name+" "+lastName);
		
		
	String city="miami";
	//olga lives in miami
	
	System.out.println(name+" lives in "+city);
	
	char grade='B';
	System.out.println(name+" is "+grade+" student");
	
	int age=21;
	System.out.println(name+" is "+ age+" years old");
	
	
	//to attach/concatenate ANY value (char, int, String, double
	
	int date=27;
	String month="September";
	System.out.println(date+" month");
	
	String state="DC";
	String anotherstate=" DC";
	
	
	//above Strings are not equal,
	//state has 2 characters and anotherState has 3
	
	System.out.println(state+anotherstate);
	
	//arithmetic operators: +, -, /,
	
	
	int num1, num2;
	num1=10;
	num2=12;
	System.out.println(num1+num2);
	System.out.println(num1-num2);
	
	double num3=10.99;
	double num4=2.99;
    System.out.println(num3*num4);   	
    
    double mul=num3*num4;	
	System.out.println(mul);
	
	double di=num3/num4;
	System.out.println(di);
	
	float f=10.99f;
	float f1=2.99f;
	
	System.out.println("The result of two float values = "+f/f1);
	
	
	

	double n1=100;
	double n2=200;
	double sum=n1+n2;
	double div=n1-n2;
	double mult=n1+n2;
	double subs=n1/n2;
	
	System.out.println(sum);
	System.out.println(div);
	System.out.println(mult);
	System.out.println(subs);
	System.out.println("The adding of 2 numbers "+n1+" and "+n2+" is equal to "+sum);
	
	
	
	
	
	
	
	
	
	
	}
}