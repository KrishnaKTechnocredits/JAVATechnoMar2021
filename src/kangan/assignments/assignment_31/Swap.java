package kangan.assignments.assignment_31;

/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class Swap {

	void swapNumber(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		Swap swap = new Swap();
		swap.swapNumber(10, 20);
	}
}
