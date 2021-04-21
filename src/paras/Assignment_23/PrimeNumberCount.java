package paras.Assignment_23;

import java.util.Scanner;

public class PrimeNumberCount {

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
		}
		return primeCount;
	} 
	
	public static void main(String[] args) {
		PrimeNumberCount primeNumberCount = new PrimeNumberCount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Start Range");
		int startRange = scanner.nextInt();
		System.out.println("Please Enter End Range");
		int endRange = scanner.nextInt();
		int count = primeNumberCount.isPrimeNumber(startRange, endRange);
		System.out.println("Prime number count between range from " + startRange + " to " + endRange + " is: " + count);
		
	}
}
