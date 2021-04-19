package radha.Assignment14;

import java.util.Scanner;

public class CalcScanner {
	int add(int num1, int num2){
		int answer = num1+num2;
		System.out.println("Addition is: "+answer);
		return answer;
	}

	int subtract(int num1, int num2){
		int answer = num1-num2;
		System.out.println("Subtraction is: "+answer+"\n");
		return answer;
	}
	
	int multiply(int num1, int num2){
		int answer = num1*num2;
		System.out.println("Multiplication is: "+answer);
		return answer;
	}
	
	int divide(int num1, int num2){
		int answer = num1/num2;
		System.out.println("Division is: "+answer);
		return answer;
	}
	
	public static void main(String[] a){
		CalcScanner calc  = new CalcScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int num1 =scanner.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2 =scanner.nextInt();
		calc.add(num1,num2);
		calc.subtract(num1, num2);
		calc.multiply(num1, num2);
		calc.divide(num1, num2);
		scanner.close();
	}
}
