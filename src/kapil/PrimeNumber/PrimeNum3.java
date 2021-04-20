//3) count all the prime numbers given range.
//input : 2 to 100
//output :

package kapil.PrimeNumber;

public class PrimeNum3 {

	int countPrime = 0;

	void getPrimeNum3(int startNum, int endNum) {

		for (int startnum = 2; startnum <= endNum; startnum++) {
			boolean isprimeflag = true;

			for (int num = 2; num <= startnum / 2; num++) {
				if (startnum % num == 0) {
					isprimeflag = false;
					break;
				}
			}
			if (isprimeflag)
				countPrime++;
		}
		System.out.println("Total count of prime number = " + countPrime);
	}

	public static void main(String[] args) {
		PrimeNum3 primenum3 = new PrimeNum3();
		primenum3.getPrimeNum3(2, 100);
	}
}
