/*
 Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

 */

package upasana.assignment_31;

public class SwapTempVar {

	void swaptemp(int x, int y) {

		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x + " ," + "  y = " + y);
	}

	public static void main(String[] args) {

		new SwapTempVar().swaptemp(10, 20);
	}

}
