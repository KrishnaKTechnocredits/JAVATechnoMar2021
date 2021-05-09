/*Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/

package sangeeta.assignment30;

import java.util.Scanner;

public class GetSecondMaxNum {

	int get2ndMaxNum(int[] num) {
		int temp = 0;
		for (int index = 0; index < num.length; index++) {
			for (int inneri = index + 1; inneri < num.length; inneri++) {
				if (num[index] > num[inneri]) {
					temp = num[index];
					num[index] = num[inneri];
					num[inneri] = temp;
				}
			}

		}
		return num[num.length - 2];
	}

	public static void main(String[] a) {
		GetSecondMaxNum GetSecondMaxNum = new GetSecondMaxNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = scanner.nextInt();
		int[] num = new int[size];
		System.out.println("Enter array elements");
		for (int index = 0; index < num.length; index++) {
			num[index] = scanner.nextInt();
		}
		int output = GetSecondMaxNum.get2ndMaxNum(num);
		System.out.println("Second maximum number is " + output);
	}

}
