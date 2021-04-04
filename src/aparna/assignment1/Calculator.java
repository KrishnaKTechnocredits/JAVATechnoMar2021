//WAP called Calculator, which has 4 methods.
//add, sub,div,mul
//2 instance variable ,x=20 and y=5.
//1 local variable answer and print the answer in every individual method.
package aparna.assignment1;

class Calculator {
	int x = 20;
	int y = 5;

	void add() {
		int answer = x + y;
		System.out.println("Addition of two Variable is:-> " + answer);
	}

	void sub() {
		int answer = x - y;
		System.out.println("Subtraction of two Variable is:-> " + answer);
	}

	void mul() {
		int answer = x * y;
		System.out.println("Multiplication of two Variable is:-> " + answer);
	}

	void div() {
		int answer = x / y;
		System.out.println("Division of two Variable is :-> " + answer);
	}

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.add();
		calculator.sub();
		calculator.mul();
		calculator.div();
	}
}