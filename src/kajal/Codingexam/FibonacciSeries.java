// Print fibonaccie series 0 1 1 2 3 5 8 13
package kajal.Codingexam;

public class FibonacciSeries {

	void fibo() {
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		System.out.println(num1);
		System.out.println(num2);
		for (int index = 0; index <= 5; index++) {
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;
		}
	}

	public static void main(String[] args) {
		new FibonacciSeries().fibo();
	}
}
