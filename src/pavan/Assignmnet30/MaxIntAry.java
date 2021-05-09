/*
 WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55
 */

package pavan.Assignmnet30;

import java.util.Scanner;

public class MaxIntAry {

	int count;
	int temp = 0;
	int high = 0;

	void getMaxAry(int[] arr) {

		for (int index = 0; index < arr.length; index++) {

			for (int innerindex = index + 1; innerindex < arr.length; innerindex++) {
				if (arr[index] > arr[innerindex]) {
					temp = arr[index];
					arr[index] = arr[innerindex];
					arr[innerindex] = temp;

				}

			}

		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int count = scan.nextInt();
		int[] arr = new int[count];
		System.out.println("Enter the elements of an arry");
		for (int i = 0; i < count; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter which highest position number you want?");
		int high = scan.nextInt();
		MaxIntAry m = new MaxIntAry();
		m.getMaxAry(arr);
		int position = count - high;
		System.out.println(high + " highest no in provided array : " + arr[position]);
	}

}
