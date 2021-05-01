package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;

/*
Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
*/

public class CountPositiveNegativeScanner {
	int posCount, negCount;

	void findCount(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				posCount++;
			} else {
				negCount++;
			}
		}
	}

	public static void main(String[] args) {
		CountPositiveNegativeScanner cntPosNeg = new CountPositiveNegativeScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		cntPosNeg.findCount(array);
		System.out.println(
				"Total positive numbers: " + cntPosNeg.posCount + "\nTotal negative numbers : " + cntPosNeg.negCount);
		scanner.close();
	}
}
