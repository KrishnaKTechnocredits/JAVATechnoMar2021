/*
 Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.

 
2) count all the prime numbers given range.
   input : 2 to 100
   output : 
3) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
4) Average of all the prime numbers given range.
   input : 2 to 100
   output :
 */

package pavan.Assignment23;

import java.util.Scanner;

public class CheckIfPrimeNo {

	void check(int target) {
		int count = 0;
		for (int num = 2; num <= target / 2; num++) {
			if (target % num == 0) {
				count = 1;
				break;
			}

		}
		if (count == 0)
			System.out.println("Given number " + target + "is prime number");
		else
			System.out.println("Given number " + target + " is not  prime number");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("provide the input number");
		int input = scan.nextInt();
		CheckIfPrimeNo a = new CheckIfPrimeNo();
		a.check(input);
	}
}
