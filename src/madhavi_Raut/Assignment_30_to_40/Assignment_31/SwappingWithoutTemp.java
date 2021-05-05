package madhavi_Raut.Assignment_30_to_40.Assignment_31;

public class SwappingWithoutTemp {
	/* Assignment - 31 : 4th May'2021 program 1: swap 2 numbers without using
	 * temporary variable. input : x = 10 , y = 20; output : x = 20, y = 10  */

	void getSwapNumbers(int num1, int num2) {
		System.out.println("Original numbers: " + num1 + " " + num2);
		num1 -= num2;
		num2 += num1;
		num1 = num2-num1;
		System.out.println("Swapped numbers: " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		new SwappingWithoutTemp().getSwapNumbers(20, 10);
	}
}
