package meenu.assignment_25;

import java.util.Arrays;
import java.util.Scanner;

/*Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
*/

import java.util.Scanner;

public class FirstFivePrimeNUm {

	int[] getPrimeNumber(int startNum, int endNum) {

		int[] primeNum = new int[5];
		int index = 0;
		int primeCount = 0;
		for (int number = startNum; number < endNum; number++) {
			int count = 0;
			for (int x = 2; x < number; x++) {
				if (number % x == 0)
					count++;
			}
			if (count == 0) {
				primeCount++;

				if (primeCount <= 5 && index < 5) {
					primeNum[index] = number;
					index++;
				} else
					break;
			}
		}
		return primeNum;
	}

	public static void main(String[] args) {
		FirstFivePrimeNUm firstFivePrimeNUm = new FirstFivePrimeNUm();
		System.out.println("First five prime Numbers between 10 and 50 are : "+Arrays.toString(firstFivePrimeNUm.getPrimeNumber(10, 50)));
	}
}
