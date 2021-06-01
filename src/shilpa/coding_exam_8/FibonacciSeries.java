/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins] 
 output : 0 1 1 2 3 5 8 13*/
package shilpa.coding_exam_8;

public class FibonacciSeries {
	void getFibonacciSeries(int range) {
		int firstnum = 0;
		int secondnum = 1;
		int nextnum = 0;
		System.out.println("Fibonacci series upto " + range);
		for (int index = 1; index <= range; index++) {
			nextnum = firstnum + secondnum;
			System.out.println(firstnum + " ");
			firstnum = secondnum;
			secondnum = nextnum;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.getFibonacciSeries(8);
	}
}
