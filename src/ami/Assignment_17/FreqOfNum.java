/*
 From given numbers, return the frequency of target number.
 */

package ami.Assignment_17;

import java.util.Scanner;

public class FreqOfNum {

	int tNum;

	void toGetFeqOfTargetNum(int[] arr) {
		int targetNumCount = 0;
		for (int index = 0; index < arr.length; index++) {
			if (tNum == arr[index]) {
				targetNumCount++;
			}
		}
		System.out.println("Frequency of Target Number : " + targetNumCount);
	}

	public static void main(String[] a) {
		FreqOfNum freqOfNum = new FreqOfNum();

		int[] arr1 = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		System.out.println("number : 10,23,23,44,23,10,23,4,23");

		Scanner sc = new Scanner(System.in);
		System.out.println("Write Frequence of Number : ");
		freqOfNum.tNum = sc.nextInt();
		freqOfNum.toGetFeqOfTargetNum(arr1);
	}
}
