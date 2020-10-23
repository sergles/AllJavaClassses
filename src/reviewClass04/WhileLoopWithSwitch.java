package reviewClass04;
import java.util.Scanner;
public class WhileLoopWithSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		double num1;
		double num2;
		char operation;
		double results;
		boolean continueLoop=true;
		
		
		
		
		while(continueLoop) {
		
		System.out.println("Please enter two numbers");
		
		Scanner scanner = new Scanner(System.in);
		
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		System.out.println("Please enter the operation + - * / ");
		
		operation = scanner.next().charAt(0);
		switch (operation) {
		case '+':
			results=num1+num2;
			break;
		case '-':
			results=num1-num2;
			break;
		case '*':
			results=num1*num2;
			break;
		case '/':
				results=num1/num2;
			break;
			default:
				results = 0;
			}
		System.out.println("Results are "+results);
		System.out.println("Enter Yes to perform more operations or No to terminate program");
		
		if  ("No".equals(scanner.next())) {
			continueLoop = false;
			
		}
		System.out.println("Thank you for using our program");
		
		}
		
		
		
		
		
		
		
	}

}
