package anubhav;

/*Program: Print Fibonacci series up to 8 numbers. [10 mins]
			output : 0 1 1 2 3 5 8 13 */

public class FibonacciSeries {

	void fibo() {

		int num1 = 0;
		int num2 = 1;
		int num3;
		for (int index = 0; index < 8; index++) {
			System.out.print(num1 + " ");
			num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.fibo();
	}
}
