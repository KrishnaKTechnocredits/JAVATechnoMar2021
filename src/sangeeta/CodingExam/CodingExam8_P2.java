/*Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam8_P2 {

	int[] getFibonacciSeries(int limit) {
		int[] output = new int[limit];
		int sum = 0;
		int firstNum = 0;
		int secondNum = 1;
		output[0] = 0;
		output[1] = 1;
		for (int index = 2; index < limit; index++) {
			sum = firstNum + secondNum;
			output[index] = sum;
			firstNum = secondNum;
			secondNum = sum;
		}
		return output;
	}

	public static void main(String[] args) {
		CodingExam8_P2 codingExam8_P2 = new CodingExam8_P2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit for Fibonacci series");
		int limit = sc.nextInt();
		int[] output = codingExam8_P2.getFibonacciSeries(limit);
		System.out.println("Fibonacci series up to " + limit + " number is:");
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}

}
