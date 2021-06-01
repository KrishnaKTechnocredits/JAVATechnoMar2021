package priyanka_Kamble.coddingExam_8;

/*
 * Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
 */
public class Fibonacci {
	int fibNumber;

	void findFibonacci() {
		int fibFirstNumber = 0, fibSecondNumber = 1;

		for (int index = 2; index <= 8; index++) {
			System.out.println(fibFirstNumber);
			fibNumber = fibFirstNumber + fibSecondNumber;
			fibFirstNumber = fibSecondNumber;
			fibSecondNumber = fibNumber;
		}
		// System.out.println(fibNumber);
	}

	public static void main(String[] args) {
		new Fibonacci().findFibonacci();
	}
}
