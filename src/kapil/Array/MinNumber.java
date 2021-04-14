//Find minimum Number 

package kapil.Array;

import java.util.Scanner;

public class MinNumber {
	void getMinNumber(int[] input) {
		int min = input[0];
		for (int index = 1; index < input.length; index++) {
			if (min > input[index])
				min = input[index];
		}
		System.out.println("Maximum nuber : " + min);
	}

	public static void main(String[] args) {
		MinNumber minnumber = new MinNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Numbers you want to enter : ");
		int size = scanner.nextInt();
		int[] num = new int[size];
		System.out.println("Enter numbers : ");
		for (int index = 0; index < num.length; index++) {
			num[index] = scanner.nextInt();
		}
		minnumber.getMinNumber(num);
	}

}
