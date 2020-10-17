package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * variable for allergy - yes or no
 * If allergy yes -> we will check pet, peanut, pollen allergy...
 * if No allergy you are lucky!
 */
	boolean allergy=true;
	
	boolean peanutAllergy=false;
	boolean pollenAllergy=false;
	boolean petAllergy=false;
	
	if (allergy) {
		System.out.println("Lets do further check");
	if(petAllergy) 
		System.out.print("Please no pets in home");
	}else 
	{
		System.out.print("That is good, you do not have allergy");
	 {
		System.out.print("You are lucky");
	}
		
	System.out.print("--------Example2------");
	}
	/*
	 * if today is Friday we will watch movie but would like to chack the date
	 * if date 13 -> watching scary movie
	 * and if it is not -> i will watch comedy, action
	 * if no Friday ->i am studying
	 */
	

	boolean isFriday=false;
	int date=13;
	boolean monday=true;
	
	if(isFriday) {
		if(date==13) {
		System.out.println("i will watch scary movie");
		}else {
			System.out.println("I will watch PK movie with Amir Khan");
		}
	}else {
			
			
	if(monday) {
		System.out.println("Today is not Friday, I am studying");
	}else {
		System.out.println("I have class"); }
	}

	/*
	 * check is assignment is completed
	 * if score>90-> great job
	 * if score>80-> good job
	 * if score>70-> please study more
	 */
	int score=65;
	boolean assignment=true;
	if(assignment) {
		if(score>90) {
			System.out.println("you did great");
		}else if(score>80) {
			System.out.println("you did good");
		}else if (score>70) {
			System.out.println("ypu need to study more");
		}else {
			System.out.println("good job but try harder");
		}
		
	}else {
		System.out.print("You should always complete all assignment");
	}
	boolean Diploma = true;
	double gpa = 3.6;
	if (Diploma) {
		System.out.println("Congratualtions");
		if (gpa >= 3.5) {
			System.out.println("You are eligible for scholarship");
		} else {
			System.out.println("You should have studied harder");
		}
	} else {
		System.out.println("Get your diploma");
	} 
	
	double MortRate = 4.6;
	double MortPrice = 200000;
	if (MortRate>4) {
		System.out.println("You cant afford a house");
	}else {
		System.out.println("You can afford it");
	 if (MortPrice>200000) {
		System.out.println("Get a loan");
	}else {
		System.out.println("Buy with cash");
	}
	
	}
	
	
	
	
	
	}
	}


