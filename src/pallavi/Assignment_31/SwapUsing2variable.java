package pallavi.Assignment_31;

/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

public class SwapUsing2variable {

	void swap(int x, int y) {
		System.out.println("Before swaping x :" + x + " Y :" + y);

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After swaping x :" + x + " Y :" + y);

	}

	public static void main(String[] args) {
		int x = 10, y = 20;
		new SwapUsing2variable().swap(x, y);
	}

}
