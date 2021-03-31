//WAP called Calculator which has 4 methods
//Add, Sub, Mul, Div
//2 instance variable x = 20, y = 5
//1 local variable answer and print the answer in individual method
package sangeeta;
class Calculator{
	int x = 20, y = 5;
	void Addition(){
		int Answer = x+y;
		System.out.println("Addition of two integers is " + Answer);
	}
	void Subtraction(){
		int Answer = x-y;
		System.out.println("Subtraction of two integers is " + Answer);
	}
	void Multiplication(){
		int Answer = x*y;
		System.out.println("Multiplication of two integers is " + Answer);
	}
	void Division(){
		int Answer = x/y;
		System.out.println("Division of two integers is " + Answer);
	}
	public static void main(String[] a){
		Calculator Calculator = new Calculator();
		Calculator.Addition();
		Calculator.Subtraction();
		Calculator.Multiplication();
		Calculator.Division();
	}
}