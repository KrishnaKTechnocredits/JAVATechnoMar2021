package ashwini.assignment10;

/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/


public class Calculator {
	int addition(int num1, int num2) {
		int sum = num1+num2;
		System.out.println(sum);
		return sum;
		}
		int subtraction(int num1, int num2) {
			int sub = num1-num2;
			System.out.println(sub);
			return sub;	
		}
		int multiplication(int num1, int num2) {
			int mul = (num1*num2); 
			System.out.println(mul);
			return mul;
		}
		double division(double num1, double num2) {
			double mul = num1/num2;
			System.out.println(mul);
			return mul;
		}
		void printTotalAnswer(int sum, int sub, double div, int mul) {
			double total = sum + sub + div + mul;
			System.out.println("Sum of All functions returns : "+total);
		}
	

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum = calculator.addition(52, 6);
		int sub = calculator.subtraction(7, 6);
		int mul = calculator.multiplication(5, 9);
		double div = calculator.division(10, 15);
		System.out.println("Final output");
		calculator.printTotalAnswer(sum, sub, div, mul);



	}

}
