/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/
package prashant.Assignment_31;

public class SwapNumwithoutTemp {
	void swapnum(int x, int y) {
		x = (x + y) - x;
		y = (x + y) - y;
		System.out.println("After Swap, Value of X " + x + " & " + "Value of Y " + y);
	}

	public static void main(String[] args) {
		SwapNumwithoutTemp swap = new SwapNumwithoutTemp();
		System.out.println("Before swap ,Value of X " + 10 + " & " + " Value of Y " + 20);
		swap.swapnum(10, 20);
	}
}
