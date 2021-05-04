/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
*/
package shilpa.Assignment_31;

public class SwapNosUsingVariable {
	void getSwapNumbers(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swap numbers are \n" + "num1 = " + num1 + "  num2 = " + num2);

	}

	public static void main(String[] args) {
		SwapNosUsingVariable swapNosUsingVariable = new SwapNosUsingVariable();
		System.out.println(("input numbers are" + "\n num1 = 10  num2 = 20"));
		swapNosUsingVariable.getSwapNumbers(10, 20);
	}

}
