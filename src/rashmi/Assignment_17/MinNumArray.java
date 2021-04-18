/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/

package rashmi.Assignment_17;

import java.util.Scanner;

public class MinNumArray {

	int getMinNum(int[] num) {
		int min = num[0];
		for (int index = 1; index < num.length; index++) {
			if (min > num[index]) {
				min = num[index];
			}
		}
		System.out.println("Minimum number from given array is " + min);
		return min;
	}

	public static void main(String[] args) {
		MinNumArray minNumArray = new MinNumArray();
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
		minNumArray.getMinNum(arr);
	}
}
