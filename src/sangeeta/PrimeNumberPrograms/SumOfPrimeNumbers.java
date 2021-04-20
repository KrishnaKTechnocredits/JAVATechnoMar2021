/* sum of all the prime numbers given range.
   input : 2 to 100
   output : */
package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class SumOfPrimeNumbers {

	void sumPrime(int range) {
		int sum = 0;
		for (int index = 2; index <= range; index++) {
			int targetNum = index;
			boolean flag = true;
			for (int num = 2; num <= targetNum / 2; num++) {
				if (targetNum % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				sum = sum + targetNum;
		}
		System.out.println("sum of prime numbers between 2 to 100 is " + sum);

	}

	public static void main(String[] a) {
		SumOfPrimeNumbers sumOfPrimeNumbers = new SumOfPrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range ");
		int range = scanner.nextInt();
		sumOfPrimeNumbers.sumPrime(range);
	}

}
