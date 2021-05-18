package kangan.assignments.assignment_23;

/*Average of all the prime numbers given range.
input : 2 to 100*/

public class AvgAllPrime {


	void avgPrimeNumber(int start, int end) {
		int sum=0;
		int count = 0;
		int avg = 0;
		
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
				sum=sum+index;
			avg =sum/count;
		}
		System.out.println("Average of all the prime numbers given range is : " + avg);
	}

	public static void main(String[] args) {
		AvgAllPrime avgAllPrime = new AvgAllPrime();
		avgAllPrime.avgPrimeNumber(2, 100);
	}
}

