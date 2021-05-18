package kangan.assignments.assignment_23;

/*count all the prime numbers given range.
input : 2 to 100*/

public class CountAllPrime {

	void countPrimeNumber(int start, int end) {
		int count = 0;

		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int num = 2; num <= index / 2; num++) {
				if (index % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				count++;
			
		}
		System.out.println("Count all the prime numbers given range is : " + count);
	}

	public static void main(String[] args) {
		CountAllPrime countAllPrime = new CountAllPrime();
		countAllPrime.countPrimeNumber(2, 100);
	}
}
