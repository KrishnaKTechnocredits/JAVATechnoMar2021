/*Assignment 23
 * 1) validate whether given number is prime or not.
 * target Number is 10 or 17, so here 10 is not prime number and 17 is Prime Number
 */
package aparna.primeNumberExample1;

public class GivenNumberIsPrimeOrNot {

	void isNumberPrimeWithCount(int targetNumber) {
		int count = 0;

		for (int num = 2; num <= targetNumber / 2; num++) {
			if (targetNumber % num == 0) {
				count = 1;
				break;
			} else {
				count = 0;
			}
		}
		if (count == 0)
			System.out.println("Given Number " + targetNumber + " is Prime Number");
		else
			System.out.println("Given Number " + targetNumber + " is not Prime Number");

	}

	public static void main(String[] args) {
		GivenNumberIsPrimeOrNot givenNumberIsPrimeOrNot = new GivenNumberIsPrimeOrNot();
		givenNumberIsPrimeOrNot.isNumberPrimeWithCount(10);
		givenNumberIsPrimeOrNot.isNumberPrimeWithCount(17);
	}

}
