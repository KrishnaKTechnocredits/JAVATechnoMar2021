package anubhav.scannerexamples;

import java.util.Scanner;

public class CalculatorScanner {

	double numA;
	double numB;
	double answer;
	String operation; 

	void calculator(String str){
		str= operation;
		switch (str) {
			 case "Addition":
			 case "addition":
			 case "add":
			 case "Add":
				 answer= (numA+numB);
				 System.out.println("Sum of both the numbers is : " + answer);
				 break;
			 case "Subtract":
			 case "subtract":
			 case "Subtraction":
			 case "subtraction":
				 answer= (numA-numB);
				 System.out.println("Difference of both the numbers is : " + answer);
				 break;
			 case "Multiply":
			 case "multiply":
			 case "Multiplication":
			 case "multiplication":
				 answer= (numA*numB);
				 System.out.println("Product of both the numbers is : " + answer);
				 break;
			 case "Divide":
			 case "divide":
			 case "Division":
			 case "division":
				 answer= (numA/numB);
				 System.out.println("Division of both the numbers is : " + answer);
				 break;
			 default:
				System.out.println("Enter a valid operation please !!");
		} 
		
	}
	
	public static void main (String[] args) {
		CalculatorScanner calculatorScanner= new CalculatorScanner();
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		double num1a= scanner.nextDouble();
		calculatorScanner.numA= num1a;
		System.out.println("Enter second number: ");
		double num1b= scanner.nextDouble();
		calculatorScanner.numB= num1b;
		System.out.println("Enter Operation to perform: ");
		String opToPerform1= scanner.next();
		calculatorScanner.operation=opToPerform1;	
		calculatorScanner.calculator("str");
	}
}
