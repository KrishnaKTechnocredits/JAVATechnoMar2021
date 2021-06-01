package mayur.coding_exam_8;

public class FibonacciSeries {
	void getFibonacciSeries(int num) {

		int num1 = 0;
		int num2 = 1;
		int nextNum;

		for (int index = 0; index <= num; index++) {
			System.out.print(num1 + " ");
			nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}

	}

	public static void main(String[] args) {
		FibonacciSeries fibonacci = new FibonacciSeries();
		int num = 8;
		fibonacci.getFibonacciSeries(num);
	}
		
}
	

