package pavan.Assignment23;

import java.util.Scanner;

public class SumOfPrimeNumber {
	
	void sumPrimeNum(int begainrange, int endrange) {
		int primesum = 0;
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
				primesum = primesum + index;
			
		}
		System.out.println("prime number count in given range is " + primesum);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range intial");
		int input = scan.nextInt();
		System.out.println("Enter the end range");
		int input2 = scan.nextInt();
		SumOfPrimeNumber sumOfPrimeNumber = new SumOfPrimeNumber();
		sumOfPrimeNumber.sumPrimeNum(input, input2);
	}

}
