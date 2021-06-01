package ashish_Vyas.Assignment_14;

import java.util.Scanner;

class CalculatorScanner {
	private static Scanner scanner;
	int addition(int num1, int num2) {
		return num1+num2;
	}
	int subtraction(int num1,int num2) {
		return num1-num2;
	}
	int division(int num1,int num2) {
		return num1/num2;
	}
	int multiplication(int num1,int num2) {
		return num1*num2;
	}
	int printTotalAnswer(int add,int sub, int div, int mul) {
		System.out.println("Addition : num1+num2 = " +add);
		System.out.println("\nSubstraction : num1-num2 = " +sub);
		System.out.println("\nDivision : num1/num2 = " +div);
		System.out.println("\nMultiplication : num1+num2 = " +mul);
		
		int addAllMethods = add + sub + div + mul;
		
		System.out.println("\nAddition Of All Methods = " +addAllMethods);
		return 0;
	}
	public static void main(String[] args) {
		CalculatorScanner calculator = new CalculatorScanner();

		scanner = new Scanner(System.in);   // Best practice --- We are not using object multiple times.
		
		System.out.println("Enter First number : ");
		int num = scanner.nextInt();
		System.out.println("Enter Second number : ");
		int num1 = scanner.nextInt();
		int a = calculator.addition(num,num1);
		int b = calculator.subtraction(num,num1);
		int c = calculator.division(num,num1);
		int d = calculator.multiplication(num,num1);
		calculator.printTotalAnswer(a,b,c,d);
		
	}
}