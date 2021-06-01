/*  1) validate whether given number is prime or not. */
package amruta.Assignment_23;

public class ValidatePrimeNum {

	void validatePrimeNumber(int target) {
		int count = 0;
		for (int num = 2; num <= target / 2; num++) {
			if (target % num == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0)
			System.out.println("Given number " + target + " is prime Nume");
		else
			System.out.println("Given number " + target + " is Not Prime Nume");
	}

	public static void main(String[] args) {
		int no = 31;
		new ValidatePrimeNum().validatePrimeNumber(no);
	}

}
