/*program 2: swap 2 numbers without using a temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.*/

package ravindra_J.Assignement_No_31_Number_Swapping;

import java.util.Scanner;

public class SwapNumWithoutTemp {

	void getSwapNumWithoutTemp() {
		int x = 0, y = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for x");
		x = scanner.nextInt();

		System.out.println("Enter number for y");
		y = scanner.nextInt();
		scanner.close();

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Numbers after swapping -> x=" + x + " y=" + y);
	}

	public static void main(String[] args) {
		SwapNumWithoutTemp snwt = new SwapNumWithoutTemp();
		snwt.getSwapNumWithoutTemp();
	}

}
