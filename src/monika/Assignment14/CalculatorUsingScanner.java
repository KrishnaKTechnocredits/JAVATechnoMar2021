package monika.Assignment14;

import java.util.Scanner;

// Calculator using scanner class

public class CalculatorUsingScanner {
	int add(int num1, int num2) {
		int addanswer = num1 + num2;
		return addanswer;
	}
	
	int sub(int num1, int num2) {
		int subanswer = num1 - num2;
		return subanswer;
	}
	
	int mul(int num1, int num2) {
		int mulanswer = num1 * num2;
		return mulanswer;
	}
	
	int div(int num1, int num2) {
		int divanswer = num1 / num2;
		return divanswer;
	}
	
	void printAnswer(int num1, int num2, int num3, int num4) {
		int finalAnswer = num1 + num2+ num3+ num4;
		System.out.println(finalAnswer);
	}
	public static void main(String[] args) {
		CalculatorUsingScanner obj = new CalculatorUsingScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide two numbers for addition : ");
		int s = sc.nextInt();
		int s1 = sc.nextInt();
		int addanswer = obj.add(s, s1);
		
		System.out.println("Provide two numbers for subtraction : ");
		int subanswer = obj.sub(sc.nextInt(), sc.nextInt());
		
		System.out.println("Provide two numbers for multiplication : ");
		int mulanswer = obj.mul(sc.nextInt(),sc.nextInt());		
		
		System.out.println("Provide two numbers for division : ");
		int divanswer = obj.mul(sc.nextInt(),sc.nextInt());		
		
		obj.printAnswer(addanswer, subanswer, mulanswer, divanswer);		
		sc.close();
	}
}
