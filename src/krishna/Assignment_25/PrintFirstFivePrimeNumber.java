package krishna.Assignment_25;

public class PrintFirstFivePrimeNumber {
	static int primeCount;

	boolean validatePrimeNum(int num) {
		int count = 0;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			primeCount++;
			return true;
		} else {
			return false;
		}
	}

	int[] primeNumberInRange(int startNum, int endNum, int outputSize) {
		int[] primeArr = new int[outputSize];
		int newArrCount = 0;
		for (int index = startNum; index < endNum; index++) {
			boolean isPrime = validatePrimeNum(index);
			if (isPrime) {
				if (newArrCount < outputSize)
					primeArr[newArrCount] = index;
				newArrCount++;
			}
		}
		return primeArr;
	}

	public static void main(String[] args) {
		PrintFirstFivePrimeNumber printFirstFivePrimeNumber = new PrintFirstFivePrimeNumber();
		int[] primeNumArr = printFirstFivePrimeNumber.primeNumberInRange(10, 100, 5);
		for (int index = 0; index < primeNumArr.length; index++) {
			System.out.println(primeNumArr[index]);
		}

	}
}
