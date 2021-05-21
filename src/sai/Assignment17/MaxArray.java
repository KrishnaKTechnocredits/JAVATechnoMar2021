package sai.Assignment17;

/*
 * Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

 */

public class MaxArray {

	public static void main(String[] args) {

		int[] num = { 22, 35, 65, 88, 11, 23, 45 };
		MaxArray maxArray = new MaxArray();
		maxArray.greater(num);
	}

	void greater(int[] num) {

		int number = num[0];
		for (int index = 1; index < num.length; index++) {
			if (num[index] > number) {
				number = num[index];
			}
		}
		System.out.println("Greater number is " + number);
	}

}
