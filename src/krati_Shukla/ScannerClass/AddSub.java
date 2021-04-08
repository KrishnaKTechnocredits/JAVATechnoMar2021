package krati_Shukla.ScannerClass;

import java.util.Scanner;

//import krati_Shukla.Calculator;

public class AddSub {
	
	
	void calculation (int op, double n1, double n2) {
		
		switch(op){
			case 1:
				double a = n1+n2;
				System.out.println("addition is"+a);
				break;
			case 2:
				double b = n1-n2;
				System.out.println ("Substraction is"+b);
				break;
			case 3:
				double c = n1*n2;
				System.out.println ("Multiplication is"+c);
				break;
			case 4:
				double d = n1/n2;
				System.out.println ("Division is"+d);
				break;
			default:
				System.out.println ("Please enter valid option");
				break;
		}
		
	}
	
	
	public static void main (String[] a)
	{
		AddSub addSub = new AddSub();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = scanner.nextDouble();
		System.out.println("Enter second number");
		double num2 = scanner.nextDouble();
		System.out.println("What action you need to perform :");
		System.out.println("1- Add");
		System.out.println("2- Sub");
		System.out.println("3- Mul");
		System.out.println("4- Div");
		int choice = scanner.nextInt();
		addSub.calculation(choice,num1,num2);
		
	}

}
