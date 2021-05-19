package kangan.assignments.assignment_31;

/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class SwapWithoutTemp {

	void swapWithoutTemp(int x, int y) {
		x= x+y;
		y= x-y;
		x= x-y;
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		SwapWithoutTemp swapWithoutTemp = new SwapWithoutTemp();
		swapWithoutTemp.swapWithoutTemp(10, 20);
	}
}
