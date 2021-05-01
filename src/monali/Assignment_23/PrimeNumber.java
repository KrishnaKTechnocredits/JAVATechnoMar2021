package monali.Assignment_23;

public class PrimeNumber {

	void validatePrimeNum(int targetnum) {
		boolean flag = true;
		for (int index = 2; index <= targetnum / 2; index++) {
			if (targetnum % index == 0)
				flag = false;
			break;
		}
		if (flag == true)
			System.out.println("given number " + targetnum + " is prime");
		else
			System.out.println("given number " + targetnum + " is not prime");

	}

	public static void main(String[] args) {
		PrimeNumber primenum = new PrimeNumber();
		primenum.validatePrimeNum(3);
		primenum.validatePrimeNum(20);
	}

}
