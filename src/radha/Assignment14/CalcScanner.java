package radha.Assignment14;

import java.util.Scanner;

public class CalcScanner {
	int add(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****Addition****");
		System.out.println("Enter the 1st number: ");
		int num1 =scanner.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 =scanner.nextInt();
		int answer = num1+num2;
		System.out.println("Addition is: "+answer+"\n");
		return answer;
	}

	int subtract(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****Subtraction****");
		System.out.println("Enter the 1st number: ");
		int num1 =scanner.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 =scanner.nextInt();
		int answer = num1-num2;
		System.out.println("Subtraction is: "+answer+"\n");
		return answer;
	}
	
	int multiply(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****Multiplication****");
		System.out.println("Enter the 1st number: ");
		int num1 =scanner.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 =scanner.nextInt();
		int answer = num1*num2;
		System.out.println("Multiplication is: "+answer+"\n");
		return answer;
	}
	
	int divide(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****Division****");
		System.out.println("Enter the 1st number: ");
		int num1 =scanner.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 =scanner.nextInt();
		int answer = num1/num2;
		System.out.println("Division is: "+answer+"\n");
		return answer;
	}
	
	void printTotalAnswer(int addResult, int subResult, int mulResult, int divResult) {
		int resTotal = addResult+subResult+mulResult+divResult;
		System.out.println("Total of all methods is: "+resTotal);
	}	
	
	public static void main(String[] a){
		CalcScanner calc  = new CalcScanner();
		int addResult= calc.add();
		int subResult= calc.subtract();
		int mulResult= calc.multiply();
		int divResult= calc.divide();
		System.out.println();
		calc.printTotalAnswer(addResult, subResult, mulResult, divResult);
	}
}
