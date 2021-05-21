/*2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13*/

package simmi.exam8;

public class FibonacciSeries {
	void fibonacci() {

		int firstNum = 0;
		int secondNum = 1;
		System.out.print(firstNum);
		System.out.print(" " + secondNum);

		for (int index = 2; index <= 7; index++) {
			int temp = 0;
			temp = secondNum + firstNum;
			System.out.print(" " + temp);
			firstNum = secondNum;
			secondNum = temp;
		}
	}

	public static void main(String[] args) {
		new FibonacciSeries().fibonacci();
	}
}
