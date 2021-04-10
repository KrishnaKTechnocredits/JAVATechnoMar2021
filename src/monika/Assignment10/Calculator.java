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
public class Calculator {
	int add(int add) {
		int total = 0;
		total = total +add;
		return total;
	}
	int sub(int total, int sub) {
		total = total - sub;
		return total;
	}
	int mul(int total,int mul) {
		total = total * mul;
		return total;
	}
	int div(int total, int div) {
		total = total/div;
		return total;
	}	
	void printTotalAnswer(int total) {
		System.out.println(total);
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addition = calc.add(-2);
		int subtraction = calc.sub(addition, 2);
		int multiplication = calc.mul(subtraction, 2);
		int division = calc.div(multiplication, 8);
		calc.printTotalAnswer(division);
	}
}
