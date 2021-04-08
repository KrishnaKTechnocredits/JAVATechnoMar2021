package sangeeta;

import java.util.Scanner;

public class CalculatorWithScanner {
	
	public static void main(String[] a){
		CalculatorWithScanner calculatorWithScanner = new CalculatorWithScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int Addition = num1 + num2;
		System.out.println("Addition of two integers is: "+Addition);
		int Subtraction = num1 - num2;
		System.out.println("Subtraction of two integers is: "+Subtraction);
		int Multiplication = num1 * num2;
		System.out.println("multiplication of two integers is: "+Multiplication);
		int Division = num1 / num2;
		System.out.println("Division of two integers is: "+Division);
		
	}

}
