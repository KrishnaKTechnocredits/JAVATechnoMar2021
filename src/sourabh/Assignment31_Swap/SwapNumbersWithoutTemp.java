/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
*/

package sourabh.Assignment31_Swap;

public class SwapNumbersWithoutTemp {
	void SwapNumbers(int x, int y) {
		x= x+y; //30
		y= x-y; //10
		x= x-y; //20
		System.out.println("x = "+x+" , "+"y = "+y);		
	}
	public static void main(String[] args) {
		SwapNumbersWithoutTemp SwapNumbersWithoutTemp= new SwapNumbersWithoutTemp();
		SwapNumbersWithoutTemp.SwapNumbers(10,20);
	}
}
