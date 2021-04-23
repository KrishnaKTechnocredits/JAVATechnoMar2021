package mayur.assignment23;

import java.util.Scanner;

public class PrimeNumberOperations {
	static int primeIndex = 0;
	int[] getPrimeNumbers(int startIndex, int endIndex) {
		int count = 0;
		
		int[] primeNumArr = new int[((endIndex - startIndex) / 2)];
		for (int index = startIndex; index < endIndex; index++) {
			boolean primeFlag = true;
			for (int index1 = 2; index1 < index; index1++) {
				if (index % index1 == 0) {
					primeFlag = false;
					break;
	}

			}
			
			if (primeFlag == true) {
				primeNumArr[primeIndex] = index;
				
				primeIndex++;
				
			}
			
		}
		
		System.out.println("Prime numbers between " + startIndex + " and " + endIndex + " are : ");
		
		for (int index = 0; index < primeNumArr.length; index++) {
			if (primeNumArr[index] != 0)
				System.out.println(primeNumArr[index]);
		}
		
		System.out.println(
				"Total count of prime numbers between " + startIndex + " and " + endIndex + " is " + primeIndex);
		return primeNumArr;
		
	}
	
	int sumPrimeNum(int[] sumArr) {
		int sum = 0;
		for (int index = 0; index < sumArr.length; index++) {
			sum += sumArr[index];
		}
		return sum;
		
	}
	
	int avgOfPrimeNumbers(int primeCount, int primeSum) {
		int average = primeSum / primeCount;
		return average;
	}
	public static void main(String[] args) {

		PrimeNumberOperations primeNumCountSumAvg = new PrimeNumberOperations();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Start index of the range for prime numbers: ");
		int startIndex = scanner.nextInt();
		System.out.println("Enter the End index of the range for prime numbers: ");
		int endIndex = scanner.nextInt();

		int[] primeNumArr = primeNumCountSumAvg.getPrimeNumbers(startIndex, endIndex);
		
		int primeSum = primeNumCountSumAvg.sumPrimeNum(primeNumArr);
		System.out
		.println("Sum of all the prime numbers between " + startIndex + " and " + endIndex + " is " + primeSum);
		
		int primeAverage = primeNumCountSumAvg.avgOfPrimeNumbers(primeIndex, primeSum);
		System.out.println(
				"Average of all the prime numbers between " + startIndex + " and " + endIndex + " is " + primeAverage);
		scanner.close();

	}


}