package komal.Assignment_31;

/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class Swap2NumWithoutTempVariable {

	void getSwapNumWithoutTemp() {
		int x = 10;
		int y = 20;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Value of x after swapping is " + x + ".");
		System.out.println("Value of y after swapping is " + y + ".");
	}

	public static void main(String[] args) {
		Swap2NumWithoutTempVariable swap2NumWithoutTempVariable = new Swap2NumWithoutTempVariable();
		swap2NumWithoutTempVariable.getSwapNumWithoutTemp();
	}
}