//print all the prime numbers given range.
//count all the prime numbers given range.

package krati_Shukla.Assignment23;

public class AllPrimeRange {

	int primeCount = 0;

	int IsPrime(int targetNum) {
		boolean primeFlag = true;
		for (int i = 2; i <= targetNum/2; i++) {
			if (targetNum % i == 0) {
				primeFlag = false;
				break;
			} 
			
		}
		if (primeFlag) {
			System.out.println("Prime Number is "+targetNum);
			primeCount++;
		}
		return primeCount;
	}

	void Range(int Lrange, int Urange) {
		int count = 0;
		for (int num = Lrange; num <= Urange; num++)
			count = IsPrime(num);
		System.out.println("Total prime nos are : " + count);
	}

	public static void main(String[] a) {
		AllPrimeRange allPrimeRange = new AllPrimeRange();
		allPrimeRange.Range(2, 100);
	}

}
