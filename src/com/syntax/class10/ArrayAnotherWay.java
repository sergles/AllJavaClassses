package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 String[] names= {"mike", "jack", "serg", "bryan", "burju"};
	 
	// String[] names;
    // name={"sabeen"}; we cannot do it in 2 steps this wayt
	 
	 System.out.println(names[3]);
	
	// how do i know hoe many elements  i have in an array?
	
	int size = names.length;
	System.out.println("Size of names array "+size);
	
	
	int a = 2;
	
	
	for (int i=0; i<=names.length; i++) {
		System.out.println(names[i]);
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
