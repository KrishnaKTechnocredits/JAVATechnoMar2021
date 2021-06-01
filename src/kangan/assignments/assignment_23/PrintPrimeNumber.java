package kangan.assignments.assignment_23;

/*print all the prime numbers given range.
input : 40 to 100
*/
public class PrintPrimeNumber {

	void printPrimeNumber(int start, int end) {
		
		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int num = 2; num <= index / 2; num++) {
				if (index % num == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true)
				System.out.println("Prime numbers in given range are : " + index);
		}
	}

	public static void main(String[] args) {
		PrintPrimeNumber printPrimeNumber = new PrintPrimeNumber();
		printPrimeNumber.printPrimeNumber(2, 20);
	}
}
