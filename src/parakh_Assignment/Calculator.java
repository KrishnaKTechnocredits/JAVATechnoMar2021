/*Calculator Program? Perform Addition, Subtraction, Multiplication, Division ? */


package parakh_Assignment;

public class Calculator {
	
	int a = 40;
	int b = 20;
	
	void Addition(){
		int answer = a+b;
		System.out.println("Addition of two number is: " +answer);
	}
	
	void Subtraction(){
		int answer = a-b;
		System.out.println("Subtraction of two number is: " +answer);
	}
	
	void Multiplication(){
		int answer = a*b;
		System.out.println("Multiplication of two number is: " +answer);
	}
	
	void Division(){
		int answer = a/b;
		System.out.println("Division of two number is: " +answer);
	}
	
	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		calculator.Addition();
		calculator.Subtraction();
		calculator.Multiplication();
		calculator.Division();
	}

}
