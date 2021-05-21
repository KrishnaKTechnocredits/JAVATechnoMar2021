package shivani.Assignment_31;
/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/
public class SwapValues {
	int temp;
	void swapingIntVaues(int x,int y) {
		temp =x;
		x=y;
		y=temp;
		System.out.println("x = "+x +", "+"y ="+y);
		
	}
	public static void main(String[] args) {
		SwapValues swapValues = new SwapValues();
		swapValues.swapingIntVaues(10,20);
	}

}
