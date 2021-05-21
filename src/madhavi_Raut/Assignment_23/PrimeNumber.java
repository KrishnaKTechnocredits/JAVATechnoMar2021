package madhavi_Raut.Assignment_23;

import madhavi_Raut.Assignment_17.IsNumberPresent;
/*Assignment - 23 : 18th April'2021

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
output :*/
public class PrimeNumber {

	static boolean isNumberPrime(int targetNum) {
		boolean flag = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	static int[] getPrimeNumbers(int startRange, int endRange) {
		int[] primeNumArray = new int[endRange - startRange];
		int index = 0;
		for (int targetNum = startRange; targetNum <= endRange; targetNum++) {
			if (isNumberPrime(targetNum)) {
				primeNumArray[index] = targetNum;
				index++;
			}
		}
		return primeNumArray;
	}

	static void displayPrimeNumbers(int[] primeNumArray) {
		System.out.println("Below are prime numbers between 40 and 100:");
		for (int index = 0; index < primeNumArray.length; index++) {
			if (primeNumArray[index] != 0)
				System.out.println(primeNumArray[index]);
		}
	}

	static int getCountOfPrimeNumbers(int startRange, int endRange) {
		int countOfPrimeNumbers = 0;
		int[] primeNumArray = getPrimeNumbers(startRange, endRange);
		for (int index = 0; index < primeNumArray.length; index++) {
			if (primeNumArray[index] != 0)
				countOfPrimeNumbers++;
		}
		return countOfPrimeNumbers;
	}

	static int getSumOfPrimeNumbers(int startRange, int endRange) {
		int[] primeNumArray = getPrimeNumbers(startRange, endRange);
		int sumOfPrimeNumbers = 0;
		for (int index = 0; index < primeNumArray.length; index++) {
			if (primeNumArray[index] != 0)
				sumOfPrimeNumbers += primeNumArray[index];
		}
		return sumOfPrimeNumbers;
	}

	static int getAvgOfPrimeNumbers(int startRange, int endRange) {
		int sumOfAvgNumbers = getSumOfPrimeNumbers(startRange, endRange);
		int countOfAvgNumbers = getCountOfPrimeNumbers(startRange, endRange);
		return sumOfAvgNumbers / countOfAvgNumbers;
	}

	public static void main(String[] args) {

		int targetNum = 31, startRange = 2, endRange = 100;
		// To find out is number Prime or not
		if (PrimeNumber.isNumberPrime(targetNum))
			System.out.println(targetNum + " is prime number.");
		else
			System.out.println(targetNum + " is not prime number.");
		System.out.println();
		// To display prime numbers from given range
		PrimeNumber.displayPrimeNumbers(PrimeNumber.getPrimeNumbers(40, 100));
		System.out.println();
		// To display count of prime numbers from given range
		System.out.println("Count of prime numbers between " + startRange + " and " + endRange + " is "
				+ PrimeNumber.getCountOfPrimeNumbers(2, 100));
		System.out.println();
		// To display sum of prime numbers from given range
		System.out.println("Sum of prime numbers between " + startRange + " and " + endRange + " is "
				+ PrimeNumber.getSumOfPrimeNumbers(2, 100));
		System.out.println();
		// To display average of prime numbers from given range
		System.out.println("Average of prime numbers between " + startRange + " and " + endRange + " is "
				+ PrimeNumber.getAvgOfPrimeNumbers(2, 100));
	}
}
