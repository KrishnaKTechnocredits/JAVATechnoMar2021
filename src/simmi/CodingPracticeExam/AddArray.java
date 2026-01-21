/*
WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]

output 1: 9

input 2 : [4,5,6,12,2,9,1,3]

output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]

output 3: 16

input 4 : [6,1,4,5,9]

output 4 : 0*/

package simmi.CodingPracticeExam;

public class AddArray {
	static int add(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 6)
				for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
					if (arr[innerIndex] == 9) {
						index = innerIndex;
						break;
					}
				}
			else if (arr[index] != 9)
				sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 4, 5, 6, 12, 2, 9, 1, 3 };
		int[] arr3 = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		int[] arr4 = { 6, 1, 4, 5, 9 };
		int num1 = add(arr1);
		int num2 = add(arr2);
		int num3 = add(arr3);
		int num4 = add(arr4);
		System.out.println("1st Array output " + num1);
		System.out.println("2nd Array output " + num2);
		System.out.println("3rd Array output " + num3);
		System.out.println("4th Array output " + num4);
	}
}
