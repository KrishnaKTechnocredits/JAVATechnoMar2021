package sandesh.Assignment_23;

import java.util.Scanner;

public class PrintAllPrimeNumbersGivenRange {
	int primeNumbersIndex;
	int[] getPrimeNumbers(int startPoint, int endPoint) {
		int[] primeNumbersArray = new int[(endPoint-startPoint) + 1];
		for(int index=startPoint; index<= endPoint; index++) {
			boolean isPrime = true;
			for(int innerIndex=2; innerIndex<index/2 + 1; innerIndex++) {
				if(index%innerIndex  == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime && index >=2) {
				primeNumbersArray[primeNumbersIndex] = index;
				primeNumbersIndex++;
			}
		}
		return primeNumbersArray;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter Start and End limits within which you want to find the prime numbers.");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Starting point -: ");
		int startLimitInput = sc1.nextInt();
		System.out.println("Enter Ending limit -: ");
		int endLimitInput = sc1.nextInt();
		PrintAllPrimeNumbersGivenRange pl1 = new PrintAllPrimeNumbersGivenRange();
		int[] resultPrimeNumbers = pl1.getPrimeNumbers(startLimitInput, endLimitInput);
		System.out.println("Resulting Prime Numbers found within " + startLimitInput + " and " + endLimitInput + " are -: ");
		for(int index=0; index<pl1.primeNumbersIndex; index++)
			System.out.print(resultPrimeNumbers[index] + ", ");
		sc1.close();
	}
}
