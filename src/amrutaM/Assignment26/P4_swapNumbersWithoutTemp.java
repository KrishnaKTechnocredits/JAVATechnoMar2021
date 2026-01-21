package amrutaM.Assignment26;

/*Program : 4  swap 2 numbers without using 3rd variable */
public class P4_swapNumbersWithoutTemp {

	void swapWithoutTemp(int num1, int num2) {
		System.out.println("Numbers before swapping --> " + num1 + " : " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num2 - num1;
		System.out.println("Numbers after swapping --> " + num1 + " : " + num2);
	}

	public static void main(String[] args) {
		new P4_swapNumbersWithoutTemp().swapWithoutTemp(10, 12);
	}
}
