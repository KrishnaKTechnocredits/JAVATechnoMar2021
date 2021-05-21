package madhavi_Raut.Assignment_30_to_40.Assignment_31;

public class SwappingUsingTemp {
	/* Assignment - 31 : 4th May'2021 program 1: swap 2 numbers using temporary
	 * variable. input : x = 10 , y = 20; output : x = 20, y = 10 */

	void getSwapNumbers(int num1, int num2) {
		System.out.println("Original numbers: " + num1 + " " + num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Swapped numbers: " + num1 + " " + num2);
	}

	public static void main(String[] args) {
		new SwappingUsingTemp().getSwapNumbers(10, 20);
	}
}
