/*program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package rahul_Hiremath.assignment_31;

public class Ass_31_2 {

	void swap(int x, int y) {
		System.out.println("Actual X: " + x + " and Y: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Swapped X: " + x + " and Y: " + y);
	}

	public static void main(String[] args) {
		Ass_31_2 ass_31_2 = new Ass_31_2();
		ass_31_2.swap(100, 20);
	}
}
