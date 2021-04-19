package monali.Assignment_23;

public class SumOfAllPrime {

	void sumOfPrime(int startrange, int endrange) {
		int sum = 0;
		int count;
		for (int index = startrange; index <= endrange; index++) {
			count = 0;
			int targetnum = index;
			int i;
			for (i = 2; i <= (targetnum / 2); i++) {
				if (targetnum % i == 0)
					count++;
				i = targetnum;
				break;
			}
			if (count == 0 && i != 1)
				sum += targetnum;
			System.out.println("\n sum of all prime number in given range is " + sum);

		}
	}

	public static void main(String[] args) {
		SumOfAllPrime sum = new SumOfAllPrime();
		sum.sumOfPrime(2, 100);
	}
}
