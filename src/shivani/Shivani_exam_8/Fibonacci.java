package shivani.Shivani_exam_8;

public class Fibonacci {
	/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
			output : 0 1 1 2 3 5 8 13*/ 
	void fibSeries(int lent) {
		int FirstNo = 0, SecNo1 = 1;
		int nextNo;

		for (int index = 0; index < lent; index++) {
			System.out.println(FirstNo + " ");
			nextNo = FirstNo + SecNo1;
			FirstNo = SecNo1;
             SecNo1 = nextNo;

		}

	}

	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		fib.fibSeries(8);

	}

}
