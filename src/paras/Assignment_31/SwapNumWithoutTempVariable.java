/*
Assignment - 31 : 4th May'2021
program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
 */
package paras.Assignment_31;

public class SwapNumWithoutTempVariable {

	void swapNumberWithoutTempVar() {
		int x = 10;
		int y = 20;
		
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Value of X is: " + x);
		System.out.println("Value of Y is: " + y);
	}
	
	public static void main(String[] args) {
		SwapNumWithoutTempVariable swapNumWithoutTempVariable = new SwapNumWithoutTempVariable();
		swapNumWithoutTempVariable.swapNumberWithoutTempVar();
	}
}
