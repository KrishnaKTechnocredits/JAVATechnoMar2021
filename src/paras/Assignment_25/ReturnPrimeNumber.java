/*
Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */

package paras.Assignment_25;

import java.util.Scanner;

public class ReturnPrimeNumber {
	
	int[] isPrimeNumber(int startRange, int endRange) {
		int primeindex = 0;
		int[] output = new int[50];
		for(int index= startRange; index <= endRange ; index++) {
			boolean isPrime = true;
		for(int num = 2; num <= index/2; num++) {
			if(index % num == 0) {
				isPrime = false;
				break;
			}
		}
			if(isPrime == true) {
				output[index] = index;
				primeindex++;
		}
			if(primeindex == 5)
			break;
		}
		return output;
	}
	public static void main(String[] args) {
		ReturnPrimeNumber returnPrimeNumber = new ReturnPrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Start Range");
		int startRange = scanner.nextInt();
		System.out.println("Please Enter End Range");
		int endRange = scanner.nextInt();
		int[] output = returnPrimeNumber.isPrimeNumber(startRange, endRange);
			for (int index = 0; index < output.length; index++) {
				if (output[index] != 0)
				System.out.println(output[index]);
		}
	}
}

