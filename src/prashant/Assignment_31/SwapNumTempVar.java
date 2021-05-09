/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/
package prashant.Assignment_31;

public class SwapNumTempVar {
	void swapnum(int x,int y) {
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swap, Value of X " + x + " & " + "Value of Y " + y);
	}

	public static void main(String[] args) {
		SwapNumTempVar swap = new SwapNumTempVar();
		System.out.println("Before swap ,Value of X " + 10 + " & " + " Value of Y " +20);
		swap.swapnum(10,20);
	}
}
