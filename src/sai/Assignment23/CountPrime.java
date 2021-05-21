package sai.Assignment23;

/*
 * 3) count all the prime numbers given range.
   input : 2 to 100
   output : 

 */

public class CountPrime {

	public static void main(String[] args) {

		CountPrime countPrime = new CountPrime();
		countPrime.primeRange(2, 100);

	}

	void primeRange(int startNum, int endNum) {
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
			}
		}
		System.out.println("prime number count in given range is " + countOfPrime);
	}
}