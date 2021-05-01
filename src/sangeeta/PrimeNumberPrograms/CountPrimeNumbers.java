/*count all the prime numbers given range.
   input : 2 to 100
   output :*/
package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class CountPrimeNumbers {

	void countPrime(int range) {
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
			if (flag == true)
				count++;
		}
		System.out.println("Total prime number between 2 to 100 are " + count);

	}

	public static void main(String[] a) {
		CountPrimeNumbers countPrimeNumbers = new CountPrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter range to count prime numbers ");
		int range = scanner.nextInt();
		countPrimeNumbers.countPrime(range);
	}

}
