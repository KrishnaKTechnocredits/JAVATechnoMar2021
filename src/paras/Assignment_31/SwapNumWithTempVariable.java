/*
Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
 */
package paras.Assignment_31;

public class SwapNumWithTempVariable {
	
	void swapNumberWithTempVar() {
		int x = 10;
		int y = 20;
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Value of x is: " + x);
		System.out.println("Value of y is: " + y);
	}
	
	public static void main(String[] args) {
		SwapNumWithTempVariable swapNumWithTempVariable = new SwapNumWithTempVariable();
		swapNumWithTempVariable.swapNumberWithTempVar();
	}
}
