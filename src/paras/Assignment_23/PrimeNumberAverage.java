package paras.Assignment_23;

import java.util.Scanner;

public class PrimeNumberAverage {
	
	int primeAverage = 0;
	int primeSum = 0;
	int primeCount = 0;
	
	int isPrimeNumber(int startRange, int endRange) {
		for(int index= startRange; index <= endRange ; index++) {
			boolean isPrime = true;
			int number = index;
		for(int num = 2; num <= number/2; num++) {
			if(number % num == 0) {
				isPrime = false;
			}
		}
		if(isPrime)
			primeCount++;
			primeSum = primeSum + number;
			primeAverage = primeSum/primeCount;
		}
		
		return primeAverage;
	} 
	
	public static void main(String[] args) {
		PrimeNumberAverage primeNumberAverage = new PrimeNumberAverage();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Start Range");
		int startRange = scanner.nextInt();
		System.out.println("Please Enter End Range");
		int endRange = scanner.nextInt();
		int primeAverage = primeNumberAverage.isPrimeNumber(startRange, endRange);
		System.out.println("Prime number count between range from " + startRange + " to " + endRange + " is: " + primeAverage);
		
	}
}
