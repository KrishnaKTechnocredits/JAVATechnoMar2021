package monika.Assignment10;
/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
*/
public class Asisgnment10_CalculatorReturnType {
	int add(int a, int b) {
		return a+b;
	}
	int sub(int a, int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	int div(int a, int b) {
		return a/b;
	}	
	void printTotalAnswer(int a, int b, int c, int d) {
		int total = a+b+c+d;
		System.out.println("Total of add, sub, mul, div method values are : "+total);
	}
	public static void main(String[] args) {
		Asisgnment10_CalculatorReturnType calc = new Asisgnment10_CalculatorReturnType();
		int addition = calc.add(5,-2);
		int subtraction = calc.sub(10, 2);
		int multiplication = calc.mul(2, 2);
		int division = calc.div(6, 8);
		calc.printTotalAnswer(addition,subtraction, multiplication, division );
	}
}
