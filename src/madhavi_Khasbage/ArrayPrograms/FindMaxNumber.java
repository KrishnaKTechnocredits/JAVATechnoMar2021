package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;
/*
Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/
public class FindMaxNumber {

	int findMaximumNum(int[] arr) {
		int temp = 0;
		int arrLength = arr.length;
		for (int index = 0; index < arr.length; index++) {
			for (int i = index + 1; i < arr.length; i++) {
				if (arr[index] > arr[i]) {
					temp = arr[index];
					arr[index] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr[arrLength - 1];
	}

	public static void main(String[] args) {
		FindMaxNumber findMax = new FindMaxNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}

		int maxNum = findMax.findMaximumNum(array);
		System.out.println("Maximum number from given array is: " + maxNum);
		scanner.close();
	}
}
