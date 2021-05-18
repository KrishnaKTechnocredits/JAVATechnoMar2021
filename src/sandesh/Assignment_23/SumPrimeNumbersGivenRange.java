package sandesh.Assignment_23;

import java.util.Scanner;

public class SumPrimeNumbersGivenRange {
	
	int getSumPrimeNumbersSum(int startPoint, int endPoint) {
		int primeNumbersSum = 0;
		for(int index=startPoint; index<= endPoint; index++) {
			boolean isPrime = true;
			for(int innerIndex=2; innerIndex<index/2 + 1; innerIndex++) {
				if(index%innerIndex  == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && index >=2)
				primeNumbersSum += index;
		}
		return primeNumbersSum;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter Start and End limits within which you want to find the sum of Prime numbers.");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting point -: ");
		int startLimitInput = sc1.nextInt();
		System.out.println("Enter Ending limit -: ");
		int endLimitInput = sc1.nextInt();
		//SumPrimeNumbersGivenRange sum1 = new SumPrimeNumbersGivenRange();
		int sumPrimeNumbers = new SumPrimeNumbersGivenRange().getSumPrimeNumbersSum(startLimitInput, endLimitInput);
		System.out.println("Sum of Prime Numbers within " + startLimitInput + " and " + endLimitInput + " is -: " + sumPrimeNumbers);
		sc1.close();
	}
}
