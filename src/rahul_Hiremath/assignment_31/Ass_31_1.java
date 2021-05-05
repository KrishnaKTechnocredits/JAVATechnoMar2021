/*program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10*/

package rahul_Hiremath.assignment_31;

public class Ass_31_1 {
	int temp;

	void swap(int x, int y) {
		temp = x;
		x = y;
		y = temp;
		System.out.println("value of X: " + x + " and value of Y: " + y);
	}

	public static void main(String[] args) {

		Ass_31_1 ass_31_1 = new Ass_31_1();
		ass_31_1.swap(20, 30);
	}
}
