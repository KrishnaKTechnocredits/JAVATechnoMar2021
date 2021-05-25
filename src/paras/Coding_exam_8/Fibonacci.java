/*
Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
 */
package paras.Coding_exam_8;

public class Fibonacci {

	void printFibonacciSeries(int n) {

		int firstNum = 0;
		int secondNum = 1;

		for (int index = 1; index <= n; index++) {
			System.out.print(firstNum + " ");
			int output = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = output;
		}
	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.printFibonacciSeries(8);
	}
}
