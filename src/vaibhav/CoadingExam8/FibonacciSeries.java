/*Coding Exam - 8 : 17th May'2021

Program 2: Print Fibonacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 

*/

package vaibhav.CoadingExam8;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciSeries {

	int[] getFibonacciSeries(int limit) {

		int[] output = new int[limit];
		int firstSum = 0;
		int secondSum = 1;
		int sum = 0;
		output[0] = 0;
		output[1] = 1;
		for (int index = 2; index < limit; index++) {
			sum = firstSum + secondSum; // 0+1 = 1
			output[index] = sum; // 1
			firstSum = secondSum;
			secondSum = sum;
		}
		return output;
	}

	public static void main(String[] args) {

		FibonacciSeries fibonacciSeries = new FibonacciSeries();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the required numbers for Fibonacci Series : ");
		int endLimit = scanner.nextInt();

		int[] outputArr = fibonacciSeries.getFibonacciSeries(endLimit);

		System.out.println("Febonacci Series upto " + endLimit + " numbers : " + Arrays.toString(outputArr));

		scanner.close();

	}
}
