package monika.Assignment14;

import java.util.Scanner;

public class CalculatorPractise {
	 Scanner sc = new Scanner(System.in);
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	int sub(int num1) {
		System.out.println("Provide value for add method");
		int answer = add(sc.nextInt(),sc.nextInt()) - num1;
		return answer; 
	}
	
	int mul(int num1) {
		System.out.println("Provide value for sub method");
		int answer = sub(sc.nextInt()) * num1;
		return answer;
	}
	
	int div(int num1) {
		//System.out.println("Provide value for div method");
		//int d = sc.nextInt();
		System.out.println("Provide value for mul method");
		//double answer = mul(sc.nextInt())/d;
		//System.out.println("Total calculation : "+answer);
		int answer = mul(sc.nextInt())/num1;
		return answer;
		
	}
	
	public static void main(String[] args) {
		CalculatorPractise obj = new CalculatorPractise();
		System.out.println("Calculator program starts from here : ");
		System.out.println("Total calculation : "+obj.div(obj.sc.nextInt()));
		//obj.div();
		//obj.div(5);
	}
}
