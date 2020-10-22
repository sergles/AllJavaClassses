package com.syntax.class09;

public class WhileVsDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// When to use while vs dowhile
		
		// if we dont know how many times we wsnt to execute same block of code -> do while and while
		// for is if we dont know how many times in advance
		
		// do while vs while
		// do while does action then check condition, while checks first
		// break - break/exist loop
		
		boolean weekend=false;
		int day=1;
		while(!weekend) {
			System.out.println("I am working");
		  if (day>=6) {
			  System.out.println("I am not working!");
		      break;
		  }
		day++;
		}
	
		// continue - skips current iteration
		
		for(int i=1; i<=5; i++) {
			if(i==3 || i==4) {
				continue;
			}
		System.out.println(i+" ");
		}
		System.out.println("-------------------------------------");
		// OUTPUT : 1 2 5
		
	// ------------------------------------
		for (int a=0; a<3; a++) { // outer loop!
			
			System.out.println("Hello"); 
			
			for  (int b=0; b<3; b++) { // inner loop!
				
				System.out.println("Bye");
				}
			System.out.println("------------------------------");
		}
		
		System.out.println("--------------MORE EXAMPLES---------------------");
		
	
	for (int c=10; c<=14; c++) {
		
		for (int j=1; j<=4; j++) {
			
			System.out.println(c+" & "+j);
			}
	     System.out.println("-------------------------");
	}
	
	System.out.println("---------How can i print numbers from 10 to 99----------------");
	
//	 for (int p=10; p<=99; p++) { // 
//		System.out.println(p+" "); 
//	 }
	 
	for (int p=1; p<=9; p++) { // using nested loop
		
		for (int k=0; k<=9; k++) {
			
			System.out.println(p+" "+k);
		}
	}
	 System.out.println("---------How i can print a clock----------------");
	 
	 
	 for (int h=0; h<24; h++) {  // using nested loop
					
			for (int m=0; m<60; m++) {
				
				if ( h< 10) {
					if (m<10) {
						System.out.println("0"+h + ":0"+ m);	
					
					}else {
					 System.out.println("0"+h+":"+m);
				}
				}else {
				System.out.println(h+":"+m);
			}
				
			}
		}
	 System.out.println("---------How i can print car odometer----------------");
	
	
	// for (int l=0; l<6; l++) { // outer loop!
			
	//		System.out.println(l); 
			
	//		for  (int r=0; r<+99999; r++) { // inner loop!
				
	//			System.out.println(r);
	//			}
	//		System.out.println("------------------------------");
	//	}
	
	 for (int a = 0; a < 10; a++) {
	  for (int b = 0; b < 10; b++) {
	   for (int c = 0; c < 10; c++) {
	    for (int d = 0; d < 10; d++) {
	     for (int u = 0; u < 10; u++){
						
	 System.out.println(a + "" + b + "" + c + "" + d + "" + u);
		}
	}
		}
	}
	    }
	 System.out.println("------------------------------");
	 
	 
	 
	 
	 
	 
	
	
	
	
	
	
	 
	 
	
	
	}

	}
