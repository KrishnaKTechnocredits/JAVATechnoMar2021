//Assignment 25 First Five Prime number
package neha_Rathi.assignment25;

public class FirstFivePrimeNum {

	boolean primeNum(int start) {
		boolean isPrime = true;
		for (int index = 2; index <= start / 2; index++) {
			if (start % index == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	int[] validatePrime(int start, int end) {
		int[] arr = new int[5];
		int count = 0;
		for (int index = start; index < end; index++) {
			if (primeNum(index)) {
				arr[count] = index;
				count++;
				if (count == 5)
					break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		FirstFivePrimeNum firstFivePrimeNum = new FirstFivePrimeNum();
		int[] arr = firstFivePrimeNum.validatePrime(10, 50);
		System.out.println("Prime numbers are: ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);
		}
	}
}
