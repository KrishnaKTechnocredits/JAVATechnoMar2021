/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/
package kajal.StringAndCharProgram;

public class Assignment_31p2 {

	void swapWithoutTemp(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println(x + "," + y);
	}

	public static void main(String[] args) {
		Assignment_31p2 assign = new Assignment_31p2();
		assign.swapWithoutTemp(10, 20);
	}
}
