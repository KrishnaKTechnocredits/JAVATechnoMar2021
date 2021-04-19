package prachi.Assignment14;

import java.util.Scanner;


/*Program 2:  Calculator program using Scanner class.*/

public class ScannerCalculator {
	
	static int add(int num1, int num2) {
		return num1+num2;
		}

	static int sub(int num1, int num2) {
		return num1-num2;
		}

	static int mult(int num1, int num2) {
		return num1*num2;
		}

	static int div(int num1, int num2) {
		return num1/num2;
		}

	public static void main(String [] args) {
		int num,num_1;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 1st No.");
		num=scanner.nextInt();
		System.out.println("Enter 2nd No.");
		num_1=scanner.nextInt();

		System.out.println("=================================================================");
		System.out.println("Addition is: " + add(num,num_1));
		System.out.println("Subtraction is: " + sub(num,num_1));
		System.out.println("multiplication is: " + mult(num,num_1));
		System.out.println("Division is: " + div(num,num_1));
		System.out.println("=================================================================");
		
		int total = add(num,num_1) + sub(num,num_1) +  mult(num,num_1) + div(num,num_1) ;
		System.out.println("Total of all arithmetic operations is : " + total);
	}		
}