/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package simmi.assignment_31;

public class SwapTemp {
	void swap(int x, int y) {
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("Value of x = " + x + " and value of y = " + y);
	}

	public static void main(String[] args) {
		SwapTemp swapTemp = new SwapTemp();
		swapTemp.swap(10, 20);
	}
}
