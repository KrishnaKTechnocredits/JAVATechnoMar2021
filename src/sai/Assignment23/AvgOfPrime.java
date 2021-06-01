package sai.Assignment23;

/*
 * 5) Average of all the prime numbers given range.
   input : 2 to 100
   output :
 */

public class AvgOfPrime {

	public static void main(String[] args) {

		AvgOfPrime avgOfPrime = new AvgOfPrime();
		avgOfPrime.avgRange(2, 100);

	}

	void avgRange(int startNum, int endNum) {
		int sumOfPrimeNumbers = 0;
		int countOfPrime = 0;
		for (; startNum <= endNum; startNum++) {
			int count = 0;
			for (int i = 2; i <= startNum / 2; i++) {
				if (startNum % i == 0) {
					count = 1;
					break;
				}
			}
			if (count != 1) {
				countOfPrime++;
				sumOfPrimeNumbers = sumOfPrimeNumbers + startNum;
			}
		}
		System.out.println("Average of the prime numbers within the given range is  " + (sumOfPrimeNumbers/countOfPrime));
	}
}
