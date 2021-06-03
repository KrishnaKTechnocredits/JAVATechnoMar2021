/*
 Write a program with different method to satisfy following requirement. 
 
 */

package ami.Assignment_23;

public class IsNumberPrime {

	void isNumPrime(int targetNum) {
		boolean isPrime = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println("prime number");
		else
			System.out.println("not prime number");
	}

	public static void main(String[] args) {
		IsNumberPrime isNumberPrime = new IsNumberPrime();
		isNumberPrime.isNumPrime(25);
	}
}
