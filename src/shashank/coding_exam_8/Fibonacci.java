/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 */
package shashank.coding_exam_8;

public class Fibonacci {

	void fibonacciSeries(int num) {
		int firstTerm = 0, secondTerm = 1, nextTerm;
		for (int index = 0; index < num; index++) {
			System.out.print(firstTerm + " ");
			nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci fibonacci = new Fibonacci();
		int num = 8;
		fibonacci.fibonacciSeries(num);
	}

}
