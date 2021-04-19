package sai.Assignment17;

/*
 * Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11

 */

public class MinArray {

	public static void main(String[] args) {
		int[] num = { 22, 35, 65, 88, 11, 23, 45 };
		MinArray minArray = new MinArray();
		minArray.smaller(num);
	}

	void smaller(int[] num) {
		int number = num[0];
		for (int index = 1; index < num.length; index++) {
			if (num[index] < number) {
				number = num[index];
			}
		}
		System.out.println("Smaller number is " + number);
	}

}
