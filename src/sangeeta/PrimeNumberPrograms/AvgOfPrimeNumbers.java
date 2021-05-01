/*Average of all the prime numbers given range.
   input : 2 to 100
   output :*/

package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class AvgOfPrimeNumbers {

	void findAvgOfprime(int range) {
		int sum = 0;
		int count = 0;
		for (int index = 2; index <= range; index++) {
			int targetNum = index;
			boolean flag = true;
			for (int num = 2; num <= targetNum / 2; num++) {
				if (targetNum % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				count++;
				sum = sum + targetNum;
			}
		}
		System.out.println("Average of sum of prime numbers between 2 to 100 is " + sum / count);

	}

	public static void main(String[] a) {
		AvgOfPrimeNumbers avgOfPrimeNumbers = new AvgOfPrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range ");
		int range = scanner.nextInt();
		avgOfPrimeNumbers.findAvgOfprime(range);

	}
}
