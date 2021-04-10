package krati_Jain.Assignment_14;

import java.util.Scanner;

public class CalculatorUserInput {
	
		void numberInput() {
			Scanner scan = new Scanner(System.in);
			System.out.println("*Calculator Utility to perform Add, Sub, Div & Mult on the 2 numbers provided by user*\n");
			System.out.println("Enter 1st number :");
			double inputNum1 = scan.nextDouble();
			System.out.println("Enter 2nd number :");
			double inputNum2 = scan.nextDouble();
			
			System.out.println("Addition of 2 numbers: " + addMethod(inputNum1, inputNum2));
			System.out.println("Substraction of 2 numbers: " + subMethod(inputNum1, inputNum2));
			System.out.println("Division of 2 numbers: " + divMethod(inputNum1, inputNum2));
			System.out.println("Multiplication of 2 numbers: " + mulMethod(inputNum1, inputNum2));
			
		}
		
		
		double addMethod(double Number1, double Number2) {
			double addResult = Number1 + Number2;
			return addResult;
		}
		double subMethod(double Number1, double Number2) {
			double subResult = Number1 - Number2;
			return subResult;
		}
		double divMethod(double Number1, double Number2) {
			double divResult = Number1/Number2;
			return divResult;
		}
		double mulMethod(double Number1, double Number2) {
			double mulResult = Number1 * Number2;
			return mulResult;
		}
		
		
		public static void main(String[] args) {
			CalculatorUserInput calUsrInput = new CalculatorUserInput();
			calUsrInput.numberInput();
			}
		

	}
