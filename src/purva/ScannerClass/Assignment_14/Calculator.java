package purva.ScannerClass.Assignment_14;

import java.util.Scanner;

public class Calculator {
	
	int add(int number1, int number2) {
		int addAns = number1 + number2;
		return addAns;
	}
	
	int sub(int number1, int number2) {
		int subAns = number1 -number2;
		return subAns;
	}
	
	int mul(int number1, int number2) {
		int mulAns = number1 * number2;
		return mulAns;
	}
	
	int division(int number1, int number2) {
		int diviAns = number1/number2;
		return diviAns;
	}
	
	void totalAnswer(int addAns, int subAns, int mulAns, int diviAns) {
		//int totalAnswer = addAns+subAns+mulAns+diviAns;
		System.out.println("total of all operation is " +(addAns+subAns+mulAns+diviAns));	
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1: ");
		
		int number1 = scanner.nextInt();//Integer.parseInt(inputNumber1);
		System.out.println("Enter Number2: ");
		String inputNumber2 = scanner.nextLine();
		int number2 = scanner.nextInt();
		
		int addAns = calculator.add(number1, number2);
		int subAns = calculator.sub(number1, number2);
		int mulAns = calculator.mul(number1, number2);
		int diviAns = calculator.division(number1, number2);
		calculator.totalAnswer(addAns,subAns,mulAns,diviAns);
		
		

	}

}
