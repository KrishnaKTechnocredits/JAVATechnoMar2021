package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;

/*
Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
odd ->  array.length - evenCount
*/

public class CountOddEvenNumberScanner {
	int evenCount, oddCount;

	void findCount(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
	}

	public static void main(String[] args) {
		CountOddEvenNumberScanner cntOddEven = new CountOddEvenNumberScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.print("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		cntOddEven.findCount(array);
		System.out.print("Even : " + cntOddEven.evenCount + "\nOdd : " + cntOddEven.oddCount);
		scanner.close();
	}
}
