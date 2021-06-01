package bhavana_assignment_14;

import java.util.Scanner;

public class CalculatorScanner {

	public static void main(String[] args) {
		 
		int num1,num2,sum,sub,mul,div;
		CalculatorScanner cs=new CalculatorScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter two numbers for addition:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		sum=num1+num2;
		System.out.println("Addition is:"+sum);
		
		System.out.println("Enter two numbers for subtraction:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		sub=num1-num2;
		System.out.println("Subtraction is:"+sub);
		
		System.out.println("Enter two numbers for multiplication:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		mul=num1*num2;
		System.out.println("Multiplication is:"+mul);
		
		System.out.println("Enter two numbers for division:");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		div=num1/num2;
		System.out.println("Division is:"+div);
		
	}
}
