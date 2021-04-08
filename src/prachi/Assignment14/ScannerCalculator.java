package prachi.Assignment14;

import java.util.Scanner;

import prachi.Assignment_10.Calculator;

/*Program 2:  Calculator program using Scanner class.*/

public class ScannerCalculator {
	
	int add(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int a =scanner.nextInt();
		System.out.println("Enter 2nd nno: ");
		int b =scanner.nextInt();
		int c = a+b;
		System.out.println("Addition is: "+c);
		return c;
	}

	int sub(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Enter 1st no: ");
		int a =scanner.nextInt();
		System.out.println("Enter 2nd nno: ");
		int b =scanner.nextInt();
		int c = a-b;
		System.out.println("Subtraction is: "+c);
		return c;
	}

	int mul(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Enter 1st no: ");
		int a =scanner.nextInt();
		System.out.println("Enter 2nd nno: ");
		int b =scanner.nextInt();
		int c = a*b;
		System.out.println("Multiplication is: "+c);
		return c;
	}

	int div(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("-----------------------------------------------");
		System.out.println("Enter 1st no: ");
		int a =scanner.nextInt();
		System.out.println("Enter 2nd nno: ");
		int b =scanner.nextInt();
		int c = a/b;
		System.out.println("Division is: "+c);
		return c;
	}

	void printTotalAnswer(int addResult, int subResult, int mulResult, int divResult) {
		int total = addResult+subResult+mulResult+divResult;
		System.out.println("-----------------------------------------------");
		System.out.println("Total of all calculator operation results is: "+total);
	}	

	public static void main(String[] a){
		ScannerCalculator calScanner  = new ScannerCalculator();
		int addResult= calScanner.add();
		int subResult= calScanner.sub();
		int mulResult= calScanner.mul();
		int divResult= calScanner.div();
		System.out.println();
		calScanner.printTotalAnswer(addResult, subResult, mulResult, divResult);
	}
}