/*
 Program 2: Print Fibonacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 
 */
package priyanka_Panat.coding_exam_8;

public class FibonacciSeriesArray {
	int[] printFibonacciSeries() {
		int[] arr = new int[8];
		int firstNum = 0;
		int secondNum = 1;
		arr[0] = firstNum;
		arr[1] = secondNum;
		for (int index = 2; index < arr.length; index++) {
			arr[index] = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = arr[index];
		}
		return arr;
	}

	public static void main(String[] args) {
		FibonacciSeriesArray fibonacciSeriesArray = new FibonacciSeriesArray();
		int output[] = fibonacciSeriesArray.printFibonacciSeries();
		for (int index = 0; index < output.length; index++)
			System.out.println(output[index]);
	}
}
