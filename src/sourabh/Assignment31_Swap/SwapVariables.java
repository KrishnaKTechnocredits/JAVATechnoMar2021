/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
*/
package sourabh.Assignment31_Swap;

public class SwapVariables {
	SwapVariables(int x, int y) {
		int temp;
		temp=x;
		x= y;
		y= temp;
		System.out.println("x = "+x+" , "+"y = "+y);
		
	}
	public static void main(String[] args) {
		SwapVariables swapVariables= new SwapVariables(10, 20);
		//swapVariables.SwapVariables(10,20);
	}

}
