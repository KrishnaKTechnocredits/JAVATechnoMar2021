package sai.Assignment23;

/*
 * 4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
 */

public class SumOfPrime {

	public static void main(String[] args) {
		
		SumOfPrime sumOfPrime = new SumOfPrime();
		sumOfPrime.sumRange(2, 100);

	}
	
	void sumRange(int startNum, int endNum) {
		int sumOfPrimeNumbers = 0;
		for (; startNum <= endNum; startNum++) {
			int count = 0;
			for (int i = 2; i <=startNum / 2; i++) {
				if (startNum % i == 0) {
					count = 1;
					break;
				}
			}
			if (count != 1) {
				sumOfPrimeNumbers = sumOfPrimeNumbers + startNum;
			}
		}
		System.out.println("prime number count in given range is " + sumOfPrimeNumbers);
	}
}
