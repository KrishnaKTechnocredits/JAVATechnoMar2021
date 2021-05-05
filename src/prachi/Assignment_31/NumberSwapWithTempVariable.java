package prachi.Assignment_31;

/*Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class NumberSwapWithTempVariable {

	static void swapNubers() {
		int x=10;
		int y=20;
		int temp;

		temp=x;
		x=y;
		y=temp;

		System.out.println("Swapped value of x using temp variable is: "+x);
		System.out.println("Swapped value of y using temp variable is :"+y);
	}

	public static void main(String[] args) {
		swapNubers();
	}
}
