package com.syntax.class05;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        
		        Scanner scan;
		        int quiz, mid, finalScore, avg;
		        
		        scan = new Scanner(System.in);
		        
		        System.out.println("Please enter your quiz score");
		        quiz = scan.nextInt();
		        
		        System.out.println("Please enter your mid term score");
		        mid = scan.nextInt();
		        
		        System.out.println("Please enter your final score");
		        finalScore = scan.nextInt();
		        
		        avg = (quiz + mid + finalScore)/3;
		        System.out.println(avg);
		        
		        char grade;
		        
		        if(avg>=90) {
		            grade='A';
		        }else if(avg>=70 && avg<90) {
		            grade='B';
		        }else if (avg>=50 && avg <70) {
		            grade='C';
		        }else if (avg>=40 && avg<50) {
		            grade='D';
		        }else {
		            grade='F';
		        }
		        System.out.println("Grade is = "+grade);
		        
		        if(grade=='A' || grade =='B') {
		            System.out.println("You are good student");
		        }else {
		            System.out.println("Please study more");
		        }
		  
		       
				String month;
				String season = null;
				
				scan = new Scanner(System.in);
				System.out.println("Please enter birth month ");
				
				month = scan.next();
				
				if (month.equals("December") || month.equals("January") || month.equals("Fabruary")) {
					season = "Winter";
					
					
				} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
					season = "Spring";
					
					
				} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
					season = "Summer";
					
		
				} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
					season = "Autumn";
				}
				System.out.println("You was born in "+season);
		        
		        
		        
	
	
	
	}
	
	
	}


