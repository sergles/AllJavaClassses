package com.syntax.class11;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	// I would like to find largest number from array
	
	int[] array = {10,0,20,8,-1,77,56};
	
	int max = array[0];
	
	for (int i=1; i<array.length; i++) {
		if (array[i]>max) {
		max = array[i];	
			
		}
	}
	System.out.println("The largest number from an array is "+max);
	
	
	}

}
