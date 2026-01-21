/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam_22 {

	static public int retunSumOfArray(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] >= 6 && arr[index] <= 9)
				while (arr[index] != 9) {
					index++;
				}
			else
				sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for (int index = 0; index < size; index++) {
			arr[index] = sc.nextInt();
		}
		int sum = retunSumOfArray(arr);
		System.out.println(sum);
	}
}
