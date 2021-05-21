/*Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output : */

package prashant.Assignment_23;

import java.util.Scanner;

public class PrimeNumber {
	boolean primeflag;

	boolean primecheck(int num) {
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

	void primeRange(int lower, int upper) {
		boolean primeflag;
		System.out.println("Prime Numbers between Range " + lower + " to " + upper + " are : ");
		for (int i1 = lower; i1 < upper; i1++) {
			if ((primeflag = primecheck(i1) == false)) {
				System.out.println(+i1);
			}
		}
	}

	void primeCnt(int lowernum, int uppernum) {
		int count = 0;
		System.out.println("Prime Numbers count between " + lowernum + " to " + uppernum + " is : ");
		for (int i3 = lowernum; i3 <= uppernum; i3++) {
			if ((primeflag = primecheck(i3) == false)) {
				count++;
			}
		}
		System.out.println(+count);
	}

	void primeSum(int lowernum1, int uppernum1) {
		int sum = 0;
		System.out.println("Prime Numbers sum between range " + lowernum1 + " to " + uppernum1 + " is : ");
		for (int i4 = lowernum1; i4 <= uppernum1; i4++) {
			if ((primeflag = primecheck(i4) == false)) {
				sum += i4;
			}
		}
		System.out.println(+sum);
	}

	void primeAvg(int lowernum2, int uppernum2) {
		double avg;
		int sum = 0;
		int count = 0;
		System.out.println("Avg of Prime numbers between range " + lowernum2 + " to " + uppernum2 + " is : ");
		for (int i5 = lowernum2; i5 <= uppernum2; i5++) {
			if ((primeflag = primecheck(i5) == false)) {
				sum = sum + i5;
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println("" + avg);
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check Whether it is Prime or Not Prime -: ");
		int num = sc.nextInt();
		boolean isPrime = prime.primecheck(num);
		if (isPrime) {
			System.out.println("Number " + num + " is not Prime Number");
		} else {
			System.out.println("Number " + num + "  is Prime Number");
		}
		prime.primeRange(40, 100);
		prime.primeCnt(2, 100);
		prime.primeSum(2, 100);
		prime.primeAvg(2, 100);
		sc.close();
	}
}