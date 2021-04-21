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

package simmi.assignment_23;

public class PrimeNumber {

	boolean validatePrime(int targetValue) {
		boolean isPrime = true;
		for (int num = 2; num <= targetValue / 2; num++) {
			if (targetValue % num == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

	void printPrime(int startIndex, int endIndex) {
		for (int targetValue = startIndex; targetValue <= endIndex; targetValue++) {
			boolean isPrime = validatePrime(targetValue);

			if (isPrime) {

				System.out.println(
						"The prime number " + targetValue + " between " + startIndex + " and " + endIndex + " are ");
			}
		}
	}

	int countPrime(int startIndex, int endIndex) {
		int count = 0;
		for (int targetValue = startIndex; targetValue <= endIndex; targetValue++) {
			boolean isPrime = validatePrime(targetValue);

			if (isPrime) {
				count++;
			}
		}
		return count;
	}

	int sumPrime(int startIndex, int endIndex) {
		int sum = 0;
		for (int targetValue = startIndex; targetValue <= endIndex; targetValue++) {
			boolean isPrime = validatePrime(targetValue);
			if (isPrime) {
				sum = sum + targetValue;
			}
		}
		return sum;
	}

	void aveargePrime(int startIndex, int endIndex) {
		int average = 0;
		int sum = sumPrime(startIndex, endIndex);
		int count = countPrime(startIndex, endIndex);
		average = sum / count;
		System.out.println("The average of numbers of prime numbers between " + startIndex + " and " + endIndex + " is "
				+ average);

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		boolean isPrime = primeNumber.validatePrime(17);
		if (isPrime)
			System.out.println("Number is a prime number");
		else
			System.out.println("Number is not a prime number");
		System.out.println();
		primeNumber.printPrime(40, 100);
		System.out.println();
		int count = primeNumber.countPrime(2, 100);
		System.out.println("The total of numbers of prime numbers between 2 to 100 are " + count);
		System.out.println();
		int sum = primeNumber.sumPrime(2, 100);
		System.out.println("The sum of numbers of prime numbers between 2 to 100 is " + sum);
		System.out.println();
		primeNumber.aveargePrime(2, 100);
	}

}
