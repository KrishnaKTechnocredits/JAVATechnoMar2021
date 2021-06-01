package pavan.Assignment23;

import java.util.Scanner;

public class CountPrimeNum {

	void cPrimeNum(int begainrange, int endrange) {
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

			if (count == 0)
				primecount++;
			// System.out.println(target+" given number is prime number");

		}
		System.out.println("prime number count in given range is " + primecount);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range intial");
		int input = scan.nextInt();
		System.out.println("Enter the end range");
		int input2 = scan.nextInt();
		CountPrimeNum countPrimeNum = new CountPrimeNum();
		countPrimeNum.cPrimeNum(input, input2);

	}

}
