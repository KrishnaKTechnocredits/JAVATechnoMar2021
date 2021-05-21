/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package sandesh.Assignment_31;

public class Swap2NumbersWithTemp {

	int[] getSwapppedNumWithTemp(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		int[] returnedArray = { num1, num2 };
		return returnedArray;
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int[] swappedArray = new Swap2NumbersWithTemp().getSwapppedNumWithTemp(x, y);
		System.out.println("Initial state ---> " + " x: " + x + " y: " + y);
		System.out.println("After swap ---> " + " x: " + swappedArray[0] + " y: " + swappedArray[1]);
	}
}
