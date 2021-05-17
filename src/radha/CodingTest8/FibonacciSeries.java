/*
Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
 */
package radha.CodingTest8;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0, num2 = 1, num3, count = 8;
		System.out.println(num1 + "\n" + num2);
		for (int index = 2; index < count; index++) {
			num3 = num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}
}
