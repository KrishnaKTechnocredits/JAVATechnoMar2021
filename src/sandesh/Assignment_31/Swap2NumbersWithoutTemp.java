package sandesh.Assignment_31;

public class Swap2NumbersWithoutTemp {

	int[] getSwapppedNumWithoutTemp(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		int[] returnedArray = { num1, num2 };
		return returnedArray;
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int[] swappedArray = new Swap2NumbersWithoutTemp().getSwapppedNumWithoutTemp(x, y);
		System.out.println("Initial state ---> " + " x: " + x + " y: " + y);
		System.out.println("After swap ---> " + " x: " + swappedArray[0] + " y: " + swappedArray[1]);
	}
}
