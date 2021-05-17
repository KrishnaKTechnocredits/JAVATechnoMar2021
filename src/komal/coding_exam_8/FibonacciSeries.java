package komal.coding_exam_8;

/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13*/
public class FibonacciSeries {
	void printFibonacciSeries(int num) {

		int firstNum = 0;
		int secondNum = 1;

		for (int index = 1; index <= num; index++) {
			System.out.print(firstNum + " ");
			int output = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = output;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.printFibonacciSeries(8);
	}
}