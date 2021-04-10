package kapil.Scanner;

import java.util.Scanner;

public class Calculator {
   
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter numbers : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("Addition of two numbers : "+(num1 + num2));
		int num3 = scanner.nextInt();
		int num4 = scanner.nextInt();
		System.out.println("substarcation of two numbers : "+(num3 - num4));
		int num5 = scanner.nextInt();
		int num6 = scanner.nextInt();
		System.out.println("multiply of two numbers : "+(num5* num6));
		int num7 = scanner.nextInt();
		int num8 = scanner.nextInt();
		System.out.println("division of two numbers : "+(num7/num8));

}}