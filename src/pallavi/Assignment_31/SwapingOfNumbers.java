package pallavi.Assignment_31;

/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class SwapingOfNumbers {

	void Swap(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swaping of numbers: " + num1 + " " + num2);

	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Before swaping of numbers :" + x + " " + y);
		new SwapingOfNumbers().Swap(x, y);
		;

	}

}
