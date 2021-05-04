package shashank_assignment23;

public class PrimeNumber {
	public boolean primeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public void allPrimeNumbers(int startIndex, int endIndex) {
		boolean flag = true;
		for (int num = startIndex; num <= endIndex; num++) {
			flag = primeNumber(num);
			if (flag)
				System.out
						.println("Number " + num + " in the range " + startIndex + " " + endIndex + " is prime number");
		}

	}

	public int countPrimeNumbers(int startIndex, int endIndex) {
		boolean flag = true;
		int count = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			flag = primeNumber(num);
			if (flag)
				count++;
		}
		return count;
	}

	public int sumPrimeNumbers(int startIndex, int endIndex) {
		boolean flag = true;
		int sum = 0;
		for (int num = startIndex; num <= endIndex; num++) {
			flag = primeNumber(num);
			if (flag)
				sum += num;
		}
		return sum;
	}

	public int avgPrimeNumbers(int startIndex, int endIndex) {
		int avg = 0, sum = 0, count = 0;
		sum = sumPrimeNumbers(startIndex, endIndex);
		count = countPrimeNumbers(startIndex, endIndex);
		avg = sum / count;
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber primeNumber = new PrimeNumber();
		boolean pNumber = primeNumber.primeNumber(7);
		if (pNumber)
			System.out.println("Given Number 7 is prime");
		primeNumber.allPrimeNumbers(40, 100);
		int count = primeNumber.countPrimeNumbers(2, 100);
		System.out.println("Total count of prime numbers in the range 2 to 100 is " + count);
		int sum = primeNumber.sumPrimeNumbers(2, 100);
		System.out.println("Total sum of prime numbers in the range 2 to 100 is " + sum);
		int avg = primeNumber.avgPrimeNumbers(2, 100);
		System.out.println("Average of prime numbers in the range 2 to 100 is " + avg);

	}

}
