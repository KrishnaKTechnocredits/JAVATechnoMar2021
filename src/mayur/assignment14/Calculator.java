package mayur.assignment14;

import java.util.Scanner;

public class Calculator {
	
	
	
	void add(int x, int y)
	{
		int answer = x+y;
		System.out.println("Addition of two variable is" +answer);
		
	}
	
	void sub(int x, int y )
	{
		int answer = x-y;
		System.out.println("Substraction of two variable is" +answer);
		
	}
	
	void mul(int x, int y)
	{
		int answer = x*y;
		System.out.println("Multiplication of two variables is" +answer);
		
	}
	
	void div(double x, double y)
	{
		double answer = x/y;
		System.out.println("Division of two variables is" +answer);
		
		
	}
	
	public static void main(String[] args)
	 {
		Calculator calculator = new Calculator();
		System.out.println("Enter the numbers: ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		calculator.add(x, y);
		calculator.sub(x, y);
	    calculator.mul(x, y);
		calculator.div(x,y);
			
	 }

	
	 	
	 }


