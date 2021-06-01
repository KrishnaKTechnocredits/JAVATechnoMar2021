package ami.Assignment_23;

public class GetPrimeNumRange {

	void isNumPrime(int targetNum) {
		boolean isPrime = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(targetNum + "prime number");
		else
			System.out.println(targetNum + "not prime number");
	}

	void numInRange(int firstIndex, int lastIndex) {
		for (int index = firstIndex; index <= lastIndex; index++) {
			isNumPrime(index);
		}
	}

	public static void main(String[] a) {
		GetPrimeNumRange getPrimeNumRange = new GetPrimeNumRange();
		getPrimeNumRange.numInRange(40, 100);
	}
}
