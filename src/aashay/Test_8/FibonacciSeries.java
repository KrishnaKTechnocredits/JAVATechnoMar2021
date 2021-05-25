package aashay.Test_8;
/*
 * Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 
 */

import java.util.Arrays;

public class FibonacciSeries {
	
	void fibonacciSeries() {
		int num1 = 0;
		int num2 = 1;
		int [] fibonacci = new int[8];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		int num3;
		for(int index = 2; index < 8; index++) {
			num3 = num1 + num2;
			fibonacci[index]=num3;
			num1 = num2;
			num2 = num3;
			
		}
		System.out.println(Arrays.toString(fibonacci));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fibonacciSeries =new FibonacciSeries();
		fibonacciSeries.fibonacciSeries();
	}

}
