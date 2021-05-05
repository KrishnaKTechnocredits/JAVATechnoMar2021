package madhavi_Khasbage.ClassVariableMethodRun;

/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
*/

public class SwapTwoNum1 {
	void swapNum(int num1, int num2) {
		System.out.println("Input:x=" + num1 + ",y=" + num2);
		
		num1 = num1+num2;
		num2 =num1-num2;
		num1=num1-num2;

		System.out.println("Output:x=" + num1 + ",y=" + num2);
	}

	public static void main(String[] args) {
		SwapTwoNum1 swapNum1 = new SwapTwoNum1();
		swapNum1.swapNum(8, 2);
	}
}
