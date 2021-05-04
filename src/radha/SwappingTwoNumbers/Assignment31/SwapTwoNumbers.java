/*
Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
 */

package radha.SwappingTwoNumbers.Assignment31;

public class SwapTwoNumbers {
	
	void swapNoUsingTemp(int x, int y) {
		int temp;
		System.out.println("-----Swap two numbers using temporary variable-----\n");
		System.out.println("Two numbers before swapping are: x = "+x+" & y = "+y);
		temp = x;
		x=y;
		y=temp;
		System.out.println("Two numbers after swapping are: \nx = "+x+" & y = "+y);
	}
	
	void swapWithoutTemp(int x, int y) {
		System.out.println("\n-----Swap two numbers without temporary variable-----\n");
		System.out.println("Two numbers before swapping are: x = "+x+" & y = "+y);
		x = x*y;
		y = x/y;
		x = x/y; 
		System.out.println("Two numbers after swapping are: \nx = "+x+" & y = "+y);
	}
	
	public static void main(String[] args) {
		SwapTwoNumbers swapNum = new SwapTwoNumbers();
		swapNum.swapNoUsingTemp(10,20);
		swapNum.swapWithoutTemp(10,20);
	}

}
