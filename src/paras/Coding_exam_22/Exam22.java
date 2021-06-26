/*
WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0
*/
package paras.Coding_exam_22;

public class Exam22 {

	int sum(int[] arr, int start, int end) {
		int sum = 0;
		boolean isAvailable = true;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != start && isAvailable) {
				sum = sum + arr[index];

			} else if (arr[index] == start) {
				isAvailable = false;
			} else if (arr[index] == end) {
				isAvailable = true;
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		Exam22 exam22 = new Exam22();
		int arr1[] = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		int arr2[] = { 1, 3, 5 };
		int arr3[] = { 4, 5, 6, 12, 2, 9, 1, 3 };
		int arr4[] = { 6, 1, 4, 5, 9 };

		int output1 = exam22.sum(arr1, 6, 9);
		System.out.println(
				"sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9 : "
						+ output1);

		int output2 = exam22.sum(arr2, 6, 9);
		System.out.println(
				"sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9 : "
						+ output2);

		int output3 = exam22.sum(arr3, 6, 9);
		System.out.println(
				"sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9 : "
						+ output3);

		int output4 = exam22.sum(arr4, 6, 9);
		System.out.println(
				"sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9 : "
						+ output4);
	}
}
