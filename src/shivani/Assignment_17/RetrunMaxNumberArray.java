package shivani.Assignment_17;

import java.util.Scanner;

/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/
public class RetrunMaxNumberArray {

	void maxNumber(int[] mNumber) {

		int max = mNumber[0];
		for (int index = 0; index < mNumber.length; index++) {

			if (mNumber[index] > max)
				max = mNumber[index];

		}
		System.out.println("max number is " + max);
	}

	public static void main(String[] args) {
		RetrunMaxNumberArray retrunMaxNumberArray = new RetrunMaxNumberArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter how many number you want to enter in list");

		int number = sc.nextInt();
		int[] num = new int[number];
		System.out.println("enter the list of " + number + "numbers");

		for (int list = 0; list < number; list++) {

			num[list] = sc.nextInt();
		}

		retrunMaxNumberArray.maxNumber(num);

	}

}
