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
output :
*/

package kapil.PrimeNumber;

public class PrimeNum {

	void getNumPrime(int targetNum) {

		boolean isprimeflag = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				isprimeflag = false;
				break;
			}
		}
		if (isprimeflag)
			System.out.println("Given number is prime = " + targetNum);
		else
			System.out.println("Given number is not prime = " + targetNum);
	}

	public static void main(String[] args) {
		PrimeNum primenum = new PrimeNum();
		primenum.getNumPrime(7);
		primenum.getNumPrime(16);
	}

}
