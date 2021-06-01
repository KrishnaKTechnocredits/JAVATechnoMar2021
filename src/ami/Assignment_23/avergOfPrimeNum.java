package ami.Assignment_23;

public class avergOfPrimeNum {

	double count = 0;
	int sum = 0;

	boolean isNumPrime(int targetNum) {
		boolean isPrime = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	void numInRange(int firstIndex, int lastIndex) {
		for (int index = firstIndex; index <= lastIndex; index++) {
			if (isNumPrime(index)) {
				count++;
				sum = sum + index;
			}
		}
		System.out.println(
				"total average of all prime number " + firstIndex + " to " + lastIndex + " : " + (sum / count));
	}

	public static void main(String[] a) {
		avergOfPrimeNum ap = new avergOfPrimeNum();
		ap.numInRange(2, 100);
	}
}
