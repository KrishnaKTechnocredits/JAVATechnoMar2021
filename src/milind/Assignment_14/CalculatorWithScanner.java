package milind.Assignment_14;

import java.util.Scanner;

public class CalculatorWithScanner {
	
	int add(int num1,int num2) {
		int sum= num1+num2;
		System.out.println("Addition : "+sum);
		return sum;
	}
	int Sub(int num1,int num2) {
		int sub= num1-num2;
		System.out.println("subtraction : "+sub);
		return sub;
	}
	int mul(int num1,int num2) {
		int mul= num1*num2;
		System.out.println("multipliction : "+mul);
		return mul;
	}
	int div(int num1,int num2) {
		int div= (num1/num2);
		System.out.println("division : "+div);
		return div;
	}
	public static void main(String[] args) {
		CalculatorWithScanner calculator=new CalculatorWithScanner();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number :");
		int num1=sc.nextInt();
		System.out.println("Enter second number :");
		int num2=sc.nextInt();
		calculator.add(num1, num2);
		calculator.Sub(num1, num2);
		calculator.mul(num1,num2);
		calculator.div(num1,num2);
	}
}
