/*Assignment - 23 : 18th April'2021
Write a program with different method to satisfy following requirement.
2) print all the prime numbers given range.
input : 40 to 100
output :
*/

package kapil.PrimeNumber;

public class PrimeNum2 {

	void getPrimeNum(int startNum, int endNum) {
		for (int number = 40; number <= endNum; number++) {
			boolean isprimeflag = true;

			for (int num = 2; num <= number / 2; num++) {
				if (number % num == 0) {
					isprimeflag = false;
					break;
				}

			}
			if (isprimeflag)
				System.out.println("Given number is Prime = " + number);
			else
				System.out.println("Given number is not Prime = " + number);
		}
	}

	public static void main(String[] args) {
		PrimeNum2 primenum2 = new PrimeNum2();
		primenum2.getPrimeNum(40, 100);
	}
}
