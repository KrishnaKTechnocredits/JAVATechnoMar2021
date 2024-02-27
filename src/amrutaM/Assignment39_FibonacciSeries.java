package amrutaM;
/*Print first N elements of the Fibonacci series.
n -> 8
output : 0,1,1,2,3,5,8,13*/

public class Assignment39_FibonacciSeries {

	static void getFibonacciSeries(int number) {
		int num1 = 0, num2 = 1;
		int sum = 0;
		System.out.print(num1 + "\t");
		System.out.print(num2 + "\t");
		for (int index = 0; index < number - 2; index++) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.print(sum + "\t");
		}
	}

	public static void main(String[] args) {
		getFibonacciSeries(8);
	}
}
