package upasana.coding_exam_8;

public class Fibonacci {
	void printFibonacciSeries(int number) {
		int fNum = 0;
		int sNum = 1;
		int nextNum = 0;

		System.out.print(fNum + " ");
		System.out.print(sNum + " ");
		for (int index = 2; index <= number; index++) {

			nextNum = fNum + sNum;
			fNum = sNum;
			sNum = nextNum;

			System.out.print(nextNum + " ");
		}

	}

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		int input = 7;
		fibonacci.printFibonacciSeries(input);
	}
}
