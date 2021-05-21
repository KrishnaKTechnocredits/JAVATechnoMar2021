package shivani.Assignment_31;

/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/
public class SwapValuesWithoutUsingTempVar {

	void SwapWithOutTemp(int x, int y) {
		x = y - x;
		y = y - x;
		x = y + x;

		System.out.println("x = " + x + ", " + "y = " + y);

	}

	public static void main(String[] args) {
		SwapValuesWithoutUsingTempVar swapValuesWithoutUsingTempVar = new SwapValuesWithoutUsingTempVar();
		swapValuesWithoutUsingTempVar.SwapWithOutTemp(10, 20);
	}
}
