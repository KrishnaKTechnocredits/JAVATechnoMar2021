/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
*/
package shilpa.Assignment_31;

public class SwapNosWithoutVariable {
	void getSwapNosWithoutVariable(int num1, int num2) {
		num1 = num2 - num1;
		num2 = num2 - num1;
		num1 = num2 + num1;
		System.out.println("Swap Numbers \n" + "num1 = " + num1 + "  num2 = " + num2);
	}

	public static void main(String[] args) {
		SwapNosWithoutVariable swapNosWithoutVariable = new SwapNosWithoutVariable();
		System.out.println(("input numbers are" + "\n num1 = 10  num2 = 20"));
		swapNosWithoutVariable.getSwapNosWithoutVariable(10, 20);
	}

}
