/*  Assignment - 31  program 1: swap 2 numbers using temporary variable.

input : x = 10 , y = 20;
output : x = 20, y = 10

   */

package amruta.Assignment_29_to_32;

public class SwapNumberUsingTempVriabl {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		int temp;
		
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("Value of x :"+x);
		System.out.println("Value of y :"+y);
	}

}
