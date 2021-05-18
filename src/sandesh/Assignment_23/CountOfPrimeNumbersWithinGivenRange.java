package sandesh.Assignment_23;

import java.util.Scanner;

public class CountOfPrimeNumbersWithinGivenRange {
	
	int getPrimeNumbersCount(int startPoint, int endPoint) {
		int primeNumbersCount = 0;
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
			}
		}
		return primeNumbersCount;
	}
		
	public static void main(String[] args) {
		System.out.println("Please enter Start and End limits within which you want to find the count of Prime numbers.");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting point -: ");
		int startLimitInput = sc1.nextInt();
		System.out.println("Enter Ending limit -: ");
		int endLimitInput = sc1.nextInt();
		int countOfPrimeNumbers = new CountOfPrimeNumbersWithinGivenRange().getPrimeNumbersCount(startLimitInput, endLimitInput);
		System.out.println("Count of Prime Numbers found within " + startLimitInput + " and " + endLimitInput + " are -: " + countOfPrimeNumbers);
		sc1.close();
	}
}
