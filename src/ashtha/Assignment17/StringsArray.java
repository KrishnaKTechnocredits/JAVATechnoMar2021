/* Program to return the index and name having maximum length in an array*/

package ashtha.Assignment17;

import java.util.Scanner;

public class StringsArray {

	void printNames(String[] name) {
		System.out.println("The names in the array are :");
		for (int index = 0; index < name.length; index++) {
			System.out.print(name[index] + " ");
		}
	}

	void maximumLength(String[] name) {
		String maxName = name[0];
		int maxIndex = 0;
		for (int index = 1; index < name.length; index++) {
			if (name[index].length() > maxName.length()) {
				maxName = name[index];
				maxIndex = index;
			}
		}
		System.out.println("                              ");
		System.out.println("The maximum length name is " + maxName + " available at index = " + maxIndex);
	}

	public static void main(String[] args) {
		StringsArray stringsArray = new StringsArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		String[] inputName = new String[size];
		if (size < 0) {
			System.out.println("Enter a valid value");
		} else {
			for (int index = 0; index < size; index++) {
				System.out.println("Enter value " + (index + 1) + " in the Array");
				inputName[index] = scanner.next();
			}
		}
		stringsArray.printNames(inputName);
		stringsArray.maximumLength(inputName);
		scanner.close();
	}
}
