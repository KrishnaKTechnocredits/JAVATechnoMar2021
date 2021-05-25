/*2: Print Fibonacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
*/
package krishna_CodingTest_8;

public class FibonacciSeries {
	void finonacci(int count) {

		int firstNum = 0;
		int lastNum = 1;
		int nextNum = 0;
		System.out.print(firstNum + " " + lastNum);
		for (int index = 0; index < count - 2; index++) {
			nextNum = firstNum + lastNum;
			System.out.print(" " + nextNum);
			firstNum = lastNum;
			lastNum = nextNum;
		}

	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.finonacci(8);
	}
}
