/*
Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
*/

package sandesh.Assignment_25;

import java.util.Scanner;

public class PrintFirst5PrimeNumWithinRange {

	int[] prime5Array = new int[5];
	int countOfPrimeNumbers;
	boolean checkIfPrime(int numInput) {
		boolean isPrime = true;
		for(int innerIndex=2; innerIndex<numInput/2 + 1; innerIndex++) {
			if(numInput%innerIndex == 0) {
				isPrime = false;
				break;
			}
		}
		return(isPrime && numInput >=2);
	}
	
	int[] getFirst5Primes(int startLimit, int endLimit) {
		int index = startLimit;
		do {
			boolean checkPrimeNum = checkIfPrime(index);
			if(checkPrimeNum) {
				prime5Array[countOfPrimeNumbers] = index;
				countOfPrimeNumbers++;
			}
			index++;
		}while(countOfPrimeNumbers < 5 && index != (endLimit+1));
		return prime5Array;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter Start and End limits within which you want to print first 5 Prime numbers");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting point");
		int startPoint = sc1.nextInt();
		System.out.println("Enter Ending limit");
		int endPoint = sc1.nextInt();
		PrintFirst5PrimeNumWithinRange prime5 = new PrintFirst5PrimeNumWithinRange();
		int[] print5Primes =  prime5.getFirst5Primes(startPoint, endPoint);
		if(prime5.countOfPrimeNumbers == 5) {
			System.out.println("First 5 prime numbers withn given range " + startPoint + " to " + endPoint + " are -: ");
			for(int index=0; index<prime5.countOfPrimeNumbers; index++)
				System.out.print(print5Primes[index] + ",");
		}
		else if(prime5.countOfPrimeNumbers == 0) {
			System.out.println("No Prime number found withn given range " + startPoint + " to " + endPoint);
		}
		else {
			System.out.println("Only " + prime5.countOfPrimeNumbers + " prime numbers found withn given range " + startPoint + " to " + endPoint);
			for(int index=0; index<prime5.countOfPrimeNumbers; index++)
				System.out.print(print5Primes[index] + ",");
		}
		sc1.close();
	}
}
