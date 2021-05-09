//swap 2 numbers using temporary variable.

package krati_Shukla.Assignment31;

public class SwapNumber {
	
	void Swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Number#1 is: "+n1+" and Number#2 is: "+n2);
		
	}
	
	void SwapAnother(int n1, int n2) {
		int sum = n1+n2;
		n1 = sum-n1;
		n2 = sum-n2;
		System.out.println("Number#1 is: "+n1+" and Number#2 is: "+n2);
	}

	public static void main(String[] a) {
		SwapNumber swapNumber = new SwapNumber();
		swapNumber.Swap(5, 10);
		swapNumber.SwapAnother(20, 10);
	}
}
