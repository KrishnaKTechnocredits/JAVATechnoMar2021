package pavan.Assignment14;

import java.util.Scanner;

public class CalculatorUsingScanner {
	
	void add(int x, int y){
		int answer = x+y;
		System.out.println("addition of two number is "+answer);	
	}

	void sub(int x, int y){
		int answer = x-y;
		System.out.println("subsctraction of two number is "+answer);	
	}
	void mul(int x, int y){
		int answer = x*y;
		System.out.println("multiplication of two number is "+answer);	
	}
	void div(int x, int y){
		int asnwer= x/y;
		System.out.println("Divison of thow number is "+asnwer);
	}	
	
	
	
	public static void main (String []args){
		
		CalculatorUsingScanner CalculatorUsingScanner = new CalculatorUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers for opperation");
		int number1= scanner.nextInt();
		int number2= scanner.nextInt();
		
		CalculatorUsingScanner.add(number1,number2);
		CalculatorUsingScanner.sub(number1,number2);
		CalculatorUsingScanner.mul(number1,number2);
		CalculatorUsingScanner.div(number1,number2);
	}

}
