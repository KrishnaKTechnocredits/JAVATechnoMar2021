package kangan.assignments.assignment_23;

/*sum of all the prime numbers given range.
input : 2 to 100*/

public class SumAllPrime {

	void sumPrimeNumber(int start, int end) {
		int sum=0;

		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int num = 2; num <= index / 2; num++) {
				if (index % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				sum=sum+index;
		}
		System.out.println("Sum of all the prime numbers given range : " + sum);
	}

	public static void main(String[] args) {
		SumAllPrime sumAllPrime = new SumAllPrime();
		sumAllPrime.sumPrimeNumber(2, 100);
	}
}
