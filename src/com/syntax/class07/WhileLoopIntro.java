package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	int time=15;
	
	   if (time>12) { // condition is true
			System.out.println("good day"); //code executes one time
		 System.out.println("---------While Loop-------------");    }
	   
	   //  while (time>12){
		//   System.out.println("good day"); //INFINITE LOOP }
	   
	   while (time>12){
		    System.out.println("good day"); // 3 (13,14,150
		    time--;
	 }
	  // while (time>12){
		//    System.out.println("good day"); // 3 (13,14,150
		//    time++; INFINITE LOOP
	   
	   // IWANT TO PRINT NUMBERS FROM 1 TO 50
	   int num=0;
	   
	   while(num>50) {
		   System.out.println(num);
		   num++;
	   }
		   
		   // I WANT TO PRINT NUKBERS FROM 10 TO 60
		   
		   int a=10;
		  
		   while(a<61)  {
			   System.out.print(a+" ");
			   a++;
			   
		   }
		   
		  int b=100;
		  while (b>=60) {
			  System.out.print(b+" ");
			  b--; }
		   
		  int c=10;  // NUMBERS FROM 10 TO 30, EVEN NUMBERS ONLY
			while(c<=30) {
				System.out.println(c);
				c+=2; }
		 
			System.out.println("-------another way--------");
		int d=10;
		  while(d<=30) {
			  
		  if (d%2==0) {
			  System.out.print(d+" ");
		  }   d++;
			  
		 
		  }
		  
		  System.out.println("--------task---------");
		  
		  // PRINT ODD NUMBERS ONLY, FROM 100 TO 1
		  int f=100;
		  while(f>=1) {
			  
		  if (f%2==1) {
			  System.out.print(f+" ");
		  }   f--;
		}
		  System.out.println("-------another way--------");
			
			int h=100;
			while (h > 0) {
				if ((h%2) !=0) {
					System.out.print(h + " ");
				}  h--;
			}
			
			
			
			
			
		  
		  
		  
		   
	   }	
		
	}


