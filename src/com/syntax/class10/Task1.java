package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String[] cars= {"MB", "BMW", "Lexus", "Kia", "Toyota", "Honda"} ;
		   
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]+" ");
		}
		
		
		System.out.println("-------Getting values from array using enhanced for loop------");
		
		// Getting values from array using enhanced for loop
		
		//  for (: name of array
		
		
		for (String car:cars) {
			System.out.println(car+" ");
		}

		
	int[] numbers = {10, 10, 90, 600, 89};
	for (int num :numbers) {
		System.out.println(num);
	}
	
	System.out.println("-------Getting values from array using enhanced for loop------");
	
	
	boolean[] arrayOfBoolean = {true, true, false, true};
	for (boolean boo:arrayOfBoolean) {
		System.out.println(boo+" ");
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
