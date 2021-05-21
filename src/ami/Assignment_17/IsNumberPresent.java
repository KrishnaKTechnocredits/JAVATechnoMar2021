/*
 return true if you find a target number from given array else return false.
*/

package ami.Assignment_17;

import java.util.Scanner;

public class IsNumberPresent {
	int targetnum;
	static int target1;

	boolean isNumberPresent(int[] arr, int target){
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == target)
				count++;
		}
		if (count > 0) {
			System.out.println("Number " + target1 + " found in given array.");
			return true;
		}else {
			System.out.println("Number " + target1 + " doesn't found in given array.");
			return false;
		}
	}

	public static void main(String[] a) {
		IsNumberPresent n1 = new IsNumberPresent();

		int[] arr1 = {10, 23, 23, 44, 23, 10, 23, 4, 23};
		System.out.println("Numer : 10,23,23,44,23,10,23,4,23");

		Scanner sc = new Scanner(System.in);
		System.out.println("Target Numer : ");
		target1 = sc.nextInt();
	    n1.isNumberPresent(arr1, target1);
	}

}
