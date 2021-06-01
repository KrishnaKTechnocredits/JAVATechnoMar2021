/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/

package rashmi.Assignment_17;

import java.util.Scanner;

public class MaxNumArray {

	int getMaxNum(int[] num) {
		int max = num[0];
		for (int index = 1; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
			}
		}
		System.out.println("Maximum number from given array is " + max);
		return max;
	}

	public static void main(String[] args) {
		MaxNumArray maxNumArray = new MaxNumArray();
		// int[] arr = { 2, 4, 6, -9, 8, 100, 1000 };
		// int[] arr= {-2,-3,-1000,-1,0};
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you would like to enter ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter the number " + (index + 1));
			arr[index] = sc.nextInt();
		}
		sc.close();
		maxNumArray.getMaxNum(arr);
	}
}
