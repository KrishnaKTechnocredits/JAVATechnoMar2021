package neha_Patil.scanner;

import java.util.Scanner;

public class Calculator {
	int addition(int num1, int num2) {
		int add = num1+ num2;
		return add;
	}

	int substraction(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	int multiplication(int num1, int num2) {
		int multi =num1 * num2;
		return multi;
	}

	int division(int num1, int num2) {
		int div = num1 / num2;
		return div;
	}

	void printTotalAnswer(int add, int sub, int mul, int div) {
		int total = add +sub + mul + div;
		System.out.println("Sum  is: " + total );
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1" ); 
		int num1 = sc.nextInt();
		System.out.println("enter num2" );
		int num2 = sc.nextInt();
      
        
        int add=calculator.addition(num1, num2);
        System.out.println("addition is"+add);
     
       int sub= calculator.substraction(num1, num2);
         System.out.println("Substrcation is"+sub);
       
        int multi=calculator.multiplication(num1, num2);
         System.out.println("Multiplication is:"+multi);
         
     
    	int div =calculator.division(num1, num2);
         System.out.println("Division is"+multi);
		 calculator.printTotalAnswer(calculator.addition(num1,num2), calculator.substraction(num1,num2), calculator.multiplication(num1,num2),
				calculator.division(num1,num2));
		System.out.println("Total answer is");
	}
}

