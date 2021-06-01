
//Program 6: From given array return max number.
//input : 22,35,65,88,11,23,45
//output : 88

package kapil.Array;

import java.util.Scanner;

public class MaxNum {

	void getMaxNum(int[] input) {

		int max = input[0];
		for (int index = 1; index < input.length; index++) {
			if (max < input[index])
				max = input[index];
		}
		System.out.println("Maximum nuber : " + max);
	}

	public static void main(String[] args) {
		MaxNum maxnum = new MaxNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Numbers you want to enter : ");
		int size = scanner.nextInt();
		int[] num = new int[size];
		for (int index = 0; index < num.length; index++) {
			System.out.println("Enter number : ");
			num[index] = scanner.nextInt();
		}
		maxnum.getMaxNum(num);
	}

}
