/*program 1: swap 2 numbers using temporary variable.
	input : x = 10 , y = 20;
	output : x = 20, y = 10*/
package kajal.StringAndCharProgram;

public class Assignment_31 {
	
		void swapNumber(int x, int y) {
			int temp = 0;
			temp = x;
			int a = y;
			y = temp;
			System.out.println(a + " " + y);
		}

		public static void main(String[] args) {
			Assignment_31 swap = new Assignment_31();
			swap.swapNumber(10, 100);
		}
	}
