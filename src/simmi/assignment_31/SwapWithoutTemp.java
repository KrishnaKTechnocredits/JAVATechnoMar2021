/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package simmi.assignment_31;

public class SwapWithoutTemp {
	void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Value of x = " + x + " and value of y = " + y);
	}

	public static void main(String[] args) {
		SwapWithoutTemp swapWithoutTemp = new SwapWithoutTemp();
		swapWithoutTemp.swap(10, 20);
	}
}
