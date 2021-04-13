package aashay.Scanner;

import java.util.Scanner;

public class CalculatorScanner {
	
		
		//Addition method
		void addition(int x, int y)
		{
			int answer = x + y;
			System.out.println("Addition of X & Y is: "+ answer);
		}
		//Subtraction method
		void subtraction(int x, int y)
		{
			int answer = x - y;
			System.out.println("Subtraction of X & Y is: "+ answer);
		}
		//Mulitplication method
		void multiplication(int x, int y)
		{
			int answer = x * y;
			System.out.println("Multiplication of X & Y is: "+ answer);
		}
		//Division method
		void division(int x, int y)
		{
			int answer = x / y;
			System.out.println("Division of X & Y is: "+ answer);
		}
		
		public static void main(String [] args)	{
			CalculatorScanner cal = new CalculatorScanner();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter X :");
			String a = scan.next();
			int x = Integer.parseInt(a);
			System.out.println("Enter Y :");
			String b = scan.next(); 
			int y = Integer.parseInt(b);
			cal.addition(x,y);
			cal.subtraction(x,y);
			cal.multiplication(x,y);
			cal.division(x,y);
			scan.close();
			
		}
		
}
