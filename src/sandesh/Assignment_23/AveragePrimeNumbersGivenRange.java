package sandesh.Assignment_23;

import java.util.Scanner;

public class AveragePrimeNumbersGivenRange {

	double getAvgOfPrimeNumbers(int startPoint, int endPoint) {
		int primeNumbersCount = 0;
		double primeNumbersSum = 0;
		for(int index=startPoint; index<= endPoint; index++) {
			boolean isPrime = true;
			for(int innerIndex=2; innerIndex<index/2 + 1; innerIndex++) {
				if(index%innerIndex  == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && index >=2) {
				primeNumbersCount++;
				primeNumbersSum += index;
			}
		}
		return (primeNumbersSum/primeNumbersCount);
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter Start and End limits within which you want to find the Average of Prime numbers.");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting point -: ");
		int startLimitInput = sc1.nextInt();
		System.out.println("Enter Ending limit -: ");
		int endLimitInput = sc1.nextInt();
		double avgPrimeNumbers = new AveragePrimeNumbersGivenRange().getAvgOfPrimeNumbers(startLimitInput, endLimitInput);
		System.out.println("Average of Prime Numbers within " + startLimitInput + " and " + endLimitInput + " is -: " + avgPrimeNumbers);
		sc1.close();
	}
}
