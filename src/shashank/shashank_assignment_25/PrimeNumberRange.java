package shashank_assignment_25;

public class PrimeNumberRange {
	int cnt = 0;

	public boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			cnt++;
		return flag;

	}

	public int[] fivePrimeNumbers(int startIndex, int endIndex) {
		int array[] = new int[5];
		for (int num = startIndex; (num <= endIndex && cnt < 5); num++) {
			boolean flag = isPrimeNumber(num);
			if (flag)
				array[cnt - 1] = num;

		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberRange primeNumberRange = new PrimeNumberRange();
		int arr[] = new int[5];
		arr = primeNumberRange.fivePrimeNumbers(10, 50);
		for (int index = 0; index < 5; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println(" are first five prime numbers in given range");

	}

}
