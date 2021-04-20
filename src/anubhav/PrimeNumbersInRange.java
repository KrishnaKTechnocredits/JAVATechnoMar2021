package anubhav;

// Program 2: Check count of prime numbers in a range
// Program 3: Sum of prime numbers in a range
// Program 4: Average of prime numbers in a range

public class PrimeNumbersInRange {

	int primeCount;
	int sum = 0;

	int[] range(int lowerRange, int upperRange) {
		boolean isPrime = true;
		for (int num = lowerRange; num <= upperRange; num++) {
			//boolean isPrime = true;
			for (int i = 2; i <= (num / 2); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
				else
					isPrime= true;
			}
			if (isPrime == true) {
				System.out.println("Prime number    : " + num);
				primeCount++;
				sum = sum + num;
			} else {
				System.out.println("Composite number: " + num);
			}
		}

		return new int[] {primeCount, sum };
	}

	public static void main(String[] args) {
		PrimeNumbersInRange primeNumbersInRange = new PrimeNumbersInRange();
		int[] output = primeNumbersInRange.range(2, 100);
		System.out.println("----Program 2 & 3 output-----");
		System.out.println("Count of prime numbers in the range is   : " + output[0]);
		System.out.println("Sum of all prime numbers in the range is : " + output[1]);
		System.out.println("------Program 4 output-------");
		System.out.println("Average of prime numbers in the range is : " + (output[1]/output[0]));
	}
}