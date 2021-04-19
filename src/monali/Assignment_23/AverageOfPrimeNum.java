package monali.Assignment_23;

public class AverageOfPrimeNum {

	void avgOfPrime(int startnum, int endnum) {
		int sum = 0, count = 0;
		boolean flag = false;
		int i;
		for (i = startnum; i <= endnum; i++) {
			flag = false;
			for (int index = i - 1; index > 1; index--) {
				if (i % index == 0)
					flag = true;
				break;
			}
		}
		if (flag == false)
			sum = sum + i;
		count++;
		System.out.println("the average is " + (sum / count));

	}

	public static void main(String[] args) {
		AverageOfPrimeNum average = new AverageOfPrimeNum();
		average.avgOfPrime(2, 100);
	}
}
