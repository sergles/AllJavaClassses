package com.syntax.class10;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ARRAYS IN JAVA
		
		// arrays are containers that store data/value of same type
		
		
		// i have 5 students in class and i need to calculate the average grade
		
		int[] grades=new int[5];
		grades[0]=98;
		grades[1]=80;
		grades[2]=89;
		grades[3]=67;
		grades[4]=77;
		
		int average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
		
		System.out.println("Avarage bscore of my sdtudents = "+average);
				
		System.out.println("----------------------------------------");
		
		
		int a=10;
		int b;
		b=10;
		
		
		double[] array;
		
		array=new double[3];
		array[0]=12.99;
		array[1]=10.89;
		
		
		System.out.println("value of last element "+array[2]);
		
		array[2]=5.99;
		System.out.println("The value of last element "+array[2]);
		
		//  array[3]=7; //ArrayIndexOutOfBoundsException:
		//  System.out.println(array[3]);
		
		System.out.println("----------------------------------------");
		
		
		
		
		String[] liquid= new String[4];  // arrays are fixed in size!
	   
		liquid[2]="water";
		liquid[1]="tea";
		//liquid[2]="juice";
		
		System.out.println(liquid[0]);
		
		
		
		
		
		
		
		
		
		
	}

}
