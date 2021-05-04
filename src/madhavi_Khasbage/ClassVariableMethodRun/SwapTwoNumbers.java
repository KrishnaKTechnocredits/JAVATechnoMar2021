package madhavi_Khasbage.ClassVariableMethodRun;
/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class SwapTwoNumbers {

	void swapNum(int num1, int num2) {
		System.out.println("Input:x=" + num1 + ",y=" + num2);
		int tempNum = num1;
		num1 = num2;
		num2 = tempNum;

		System.out.println("Output:x=" + num1 + ",y=" + num2);
	}

	public static void main(String[] args) {
		SwapTwoNumbers swapNum1 = new SwapTwoNumbers();
		swapNum1.swapNum(6, 9);
	}
}
