package meenu.assignment_14;

/*Write a class called calculator using Scanner with following functionality.
a. add
b. subtraction
c. division
d. multiplication
*/

import java.util.Scanner;

public class CalculatorUsingScanner {
	
	int addition(int x,int y) {
		return x+y;
	}

	int subtraction(int x,int y) {
		return x-y;
	}
	
	int multiplication(int x,int y) {
		return x*y;
	}
	
	int division(int x,int y) {
		if(y == 0) {
			System.out.println("Invalid Input");
			return 0;
		}else
		 return x/y;
	}

	public static void main(String[] args) {
		CalculatorUsingScanner calculatorUsingScanner = new CalculatorUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter first number : ");
		int num2 = scanner.nextInt();
		int addAnswer = calculatorUsingScanner.addition(num1,num2);
		System.out.println("Addition of "+num1+" and "+num2+ " is : "+addAnswer);
		int subAnswer = calculatorUsingScanner.subtraction(num1,num2);
		System.out.println("Subtraction of "+num1+" and "+num2+" is : "+subAnswer);
		int multAnswer = calculatorUsingScanner.multiplication(num1,num2);
		System.out.println("Multiplication of "+num1+" and "+num2+" is : "+multAnswer);
		int divideAnswer = calculatorUsingScanner.division(num1,num2);
		System.out.println("division of "+num1+" and "+num2+" is : "+divideAnswer);
	}

}
