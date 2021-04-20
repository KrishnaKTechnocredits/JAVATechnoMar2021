package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;

/* 
Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

public class FindMinimumNumber {

	int findMinimumNum(int[] arr) {
		int temp = 0;
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] < min) {
				min = arr[index];
			}
		}		
		return min;
	}

	public static void main(String[] args) {
		FindMinimumNumber findMin = new FindMinimumNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}

		int minNum = findMin.findMinimumNum(array);
		System.out.println("Minimum number from given array is: " + minNum);
		scanner.close();
	}

}
