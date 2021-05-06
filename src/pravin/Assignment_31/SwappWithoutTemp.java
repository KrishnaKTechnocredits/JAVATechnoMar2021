/* Assignment - 31 : 4th May'2021 program 1: swap 2 numbers without using
	 * temporary variable. input : x = 10 , y = 20; output : x = 20, y = 10  */
package pravin.Assignment_31;

public class SwappWithoutTemp {
	void getSwapNumbers(int num1, int num2) {
		System.out.println("Original numbers: " + num1 + " " + num2);
		num1 -= num2;
		num2 += num1;
		num1 = num2 - num1;
		System.out.println("Swapped numbers: " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		new SwappWithoutTemp().getSwapNumbers(20, 10);
	}
}