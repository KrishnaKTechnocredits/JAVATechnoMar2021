package vaibhav.Practive;

public class PrimeNumber {

	void validateNumberIsPrime(int targetNum) {
		int num = 2;
		for (; num <= targetNum / 2; num++) {
			if (targetNum % num == 0)
				break;

		}
		if ((targetNum / 2+1) == num)
			System.out.println("Given number " + targetNum + " is prime");
		else
			System.out.println("Given number " + targetNum + " is not prime");

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.validateNumberIsPrime(17);
	
	}

}
