/*
Write a program with different method to satisfy following requirement. 
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
   output : 
 */

package paras.Assignment_23;

import java.util.Scanner;

public class PrimeNumber {
	
	void isPrimeNumber(int number) {
		boolean isPrime = true;
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println("Given number " + number + " is Prime");
			
		else
			System.out.println("Given number " + number + " is Not Prime");
	} 
	
	void isPrimeNumberRange(int startRange, int endRange) {
		for(int i= startRange; i <= endRange ; i++) {
			isPrimeNumber(i);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number to check prime or not ?");
		int number = scanner.nextInt();
		primeNumber.isPrimeNumber(number);
		System.out.println("\nPlease enter Start Range");
		int startRange = scanner.nextInt();
		System.out.println("Please enter End Range");
		int endRange = scanner.nextInt();
		primeNumber.isPrimeNumberRange(startRange, endRange);
	}
}
