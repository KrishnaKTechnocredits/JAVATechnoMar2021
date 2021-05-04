/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package sangeeta.Assignment31;

import java.util.Scanner;

public class SwapNumbersWithTemp {

	void swapNumbers(int x, int y) {
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

	public static void main(String[] a) {
		SwapNumbersWithTemp swapNumbersWithTemp = new SwapNumbersWithTemp();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value of x");
		int x = scanner.nextInt();
		System.out.println("Enter value of y");
		int y = scanner.nextInt();
		swapNumbersWithTemp.swapNumbers(x, y);
	}
}
