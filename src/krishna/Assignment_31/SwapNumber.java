package krishna.Assignment_31;

/*Program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
*/
public class SwapNumber {
	void swapNumUseIntVariable(int num1, int num2) {
		int temp;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Given number after swaping : " +num1+" "+num2);
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("Original given number before swaping :" +x + " " +y);
				
		SwapNumber swapNumber = new SwapNumber();
		swapNumber.swapNumUseIntVariable(x,y);
	}

}
