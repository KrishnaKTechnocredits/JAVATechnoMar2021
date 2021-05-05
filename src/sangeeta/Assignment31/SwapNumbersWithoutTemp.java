/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.*/

package sangeeta.Assignment31;

import java.util.Scanner;

public class SwapNumbersWithoutTemp {

	void swapNumbers(int x, int y) {
		x = x + y;
		y = y + x;
		x = x - x;
		y = y - y;
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
