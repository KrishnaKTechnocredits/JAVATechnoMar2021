/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
Hint : think on some arithmetic calculation.*/

package krati_Jain.Assignment_31;

public class Swap2NumbersArithmetic {
	
	int x;
	int y;

	
	public static void main(String[] args) {
		Swap2NumbersArithmetic swap2NumbersArithmetic = new Swap2NumbersArithmetic();
		swap2NumbersArithmetic.processSwap(-10, 20);
		
	}
	
	void processSwap(int firstNum, int secNum) {
		System.out.println("First num is : " + firstNum + "\nSecond num is : " + secNum );
		int add = firstNum + secNum;
		firstNum = add-firstNum;
		secNum = add - secNum;
		
		System.out.println("\nAfter Swaping \nFirst num is : " + firstNum + "\nSecond num is : " + secNum );
		
	}

}
