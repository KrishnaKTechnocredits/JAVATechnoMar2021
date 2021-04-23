//4) sum of all the prime numbers given range.
//input : 2 to 100
//output :

package kapil.PrimeNumber;

public class PrimeNum4 {

	int sum = 0;

	void getPrimeNum4(int startNum, int endNum) {

		for (int startnum = 2; startnum <= endNum; startnum++) {
			boolean isprimeflag = true;
			for (int num = 2; num <= startnum / 2; num++) {
				if (startnum % num == 0) {
					isprimeflag = false;
					break;
				}
			}
			if (isprimeflag)
				sum = sum + startnum;
		}
		System.out.println("Total sum of prime number = " + sum);
	}

	public static void main(String[] args) {
		PrimeNum4 primenum4 = new PrimeNum4();
		primenum4.getPrimeNum4(2, 100);
	}
}
