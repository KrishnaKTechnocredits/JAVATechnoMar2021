package renuka.assignment14;

import java.util.Scanner;

public class CalculatorScanner {
	void numberInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("*Calculator Utility to perform Add, Sub, Div & Mult on the 2 numbers provided by user*\n");
		System.out.println("Enter 1st number :");
		double inputNum1 = scan.nextDouble();
		System.out.println("Enter 2nd number :");
		double inputNum2 = scan.nextDouble();
		scan.close();

		System.out.println("Addition of 2 numbers: " + add(inputNum1,inputNum2));
		System.out.println("Substraction of 2 numbers: " + sub(inputNum1, inputNum2));
		System.out.println("Division of 2 numbers: " + div(inputNum1, inputNum2));
		System.out.println("Multiplication of 2 numbers: " + mul(inputNum1, inputNum2));

	}


	double add(double Number1, double Number2) {
		double addResult = Number1 + Number2;
		return addResult;
	}
	double sub(double Number1, double Number2) {
		double subResult = Number1 - Number2;
		return subResult;
	}
	double div(double Number1, double Number2) {
		double divResult = Number1/Number2;
		return divResult;
	}
	double mul(double Number1, double Number2) {
		double mulResult = Number1 * Number2;
		return mulResult;
	}


	public static void main(String[] args) {
		CalculatorScanner calScan = new CalculatorScanner();
		calScan.numberInput();
		}



}
