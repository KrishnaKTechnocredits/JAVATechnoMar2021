/* Java Assignment-10 : 3rd April 2021
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
package radha.Assignment10;

public class Calculator {
	int add(int num1, int num2){
		int answer = num1+num2;
		System.out.println("Addition is: "+answer);
		return answer;
	}

	int subtract(int num1, int num2){
		int answer = num1-num2;
		System.out.println("Subtraction is: "+answer);
		return answer;
	}
	
	int multiply(int num1, int num2){
		int answer = num1*num2;
		System.out.println("Multiplication is: "+answer);
		return answer;
	}
	
	int divide(int num1, int num2){
		int answer = num1/num2;
		System.out.println("Division is: "+answer);
		return answer;
	}
	
	void printTotalAnswer(int addResult, int subResult, int mulResult, int divResult) {
		int resTotal = addResult+subResult+mulResult+divResult;
		System.out.println("Total of all methods is: "+resTotal);
	}	
	
	public static void main(String[] a){
		Calculator calc  = new Calculator();
		int addResult= calc.add(15, 5);
		int subResult= calc.subtract(45, 23);
		int mulResult= calc.multiply(5, 4);
		int divResult= calc.divide(45, 9);
		System.out.println();
		calc.printTotalAnswer(addResult, subResult, mulResult, divResult);
	}
}
