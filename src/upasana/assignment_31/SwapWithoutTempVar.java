/*
program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
 */

package upasana.assignment_31;

public class SwapWithoutTempVar {
	void swap(int x, int y) {

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x = " + x + " ," + " y = " + y);
	}

	public static void main(String[] args) {

		new SwapWithoutTempVar().swap(10, 20);
	}
}
