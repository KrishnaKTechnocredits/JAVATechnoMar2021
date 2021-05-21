/*Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23*/
package prashant.Assignment_25;

import java.util.Scanner;

public class PrimeRangeArray {
	boolean primefive(int num) {
		boolean flag = false;
		// to check num is divisible in range 2 and it s half
		if (num == 0 || num == 1) {
			return flag;
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					{
						flag = true;
						break;
					}
				}
			}
			if (flag) {

				return flag;
			} else {

				return flag;
			}
		}
	}

	void primeRange1(int lower, int upper) {
		boolean primeflag;
		int count = 0;
		System.out.println("First five Prime Numbers between Range " + lower + " to " + upper + " are : ");
		for (int i1 = lower; i1 < upper; i1++) {
			if ((primeflag = primefive(i1) == false)) {
				System.out.println(+i1);
				count++;
				if (count == 5) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		PrimeRangeArray primerange = new PrimeRangeArray();
		System.out.println("Enter Range Start Index ");
		Scanner sc1 = new Scanner(System.in);
		int startidx = sc1.nextInt();
		System.out.println("Enter Range End Index ");
		Scanner sc2 = new Scanner(System.in);
		int endidx = sc2.nextInt();
		primerange.primeRange1(startidx, endidx);
		sc1.close();
		sc2.close();
	}
}
