//sum of all the prime numbers given range.

// Average of all the prime numbers given range.

package krati_Shukla.Assignment23;

public class SumAvgPrime {

	int total = 0;
	int primeCount = 0;

	int IsPrime(int targetNum) {
		boolean primeFlag = true;
		for (int i = 2; i <= targetNum / 2; i++) {
			if (targetNum % i == 0) {
				primeFlag = false;
				break;
			}

		}
		if (primeFlag) {
			total = total + targetNum;
			primeCount++;
		}
		return total;
	}

	void Sum(int Lrange, int Urange) {

		for (int num = Lrange; num <= Urange; num++)
			total = IsPrime(num);

		System.out.println("Sum of all prime numbers between " + Lrange + "-> " + Urange + " is " + total);
		System.out.println(
				"Average of all prime numbers between " + Lrange + "-> " + Urange + " is " + (total / primeCount));
	}

	public static void main(String[] a) {
		SumAvgPrime sumAvgPrime = new SumAvgPrime();
		sumAvgPrime.Sum(2, 100);
	}

}
