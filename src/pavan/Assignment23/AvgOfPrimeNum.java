package pavan.Assignment23;

import java.util.Scanner;

public class AvgOfPrimeNum {

	void avgPrimeNum(int begainrange, int endrange) {
		int primesum = 0;
		int primecount = 0;
		for (int index = begainrange; index <= endrange; index++) {
			int target = index;
			int count = 0;

			for (int num = 2; num <= target / 2; num++) {
				if (target % num == 0) {
					count = 1;
					break;
				}
			}

			if (count == 0) {
				primecount++;
				primesum = primesum + index;
			}
		}
		float average = primesum / primecount;
		System.out.println("prime number count in given range is " + average);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range intial");
		int input = scan.nextInt();
		System.out.println("Enter the end range");
		int input2 = scan.nextInt();
		AvgOfPrimeNum avgOfPrimeNum = new AvgOfPrimeNum();
		avgOfPrimeNum.avgPrimeNum(input, input2);
	}
}
