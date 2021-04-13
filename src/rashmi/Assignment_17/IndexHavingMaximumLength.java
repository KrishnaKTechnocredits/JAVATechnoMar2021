/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

package rashmi.Assignment_17;

import java.util.Scanner;

public class IndexHavingMaximumLength {

	int getIndexOfMaxLength(String[] arr) {
		int getIndex = 0;

		for (int index = 1; index < arr.length; index++) {
			if (arr[getIndex].length() < arr[index].length()) {

				getIndex = index;
			}
		}
		System.out.println("Index Having maximum length is " + getIndex);
		return getIndex;

	}

	public static void main(String[] args) {
		// String arr[] = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		IndexHavingMaximumLength indexHavingMaximumLength = new IndexHavingMaximumLength();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names you would like to enter");
		int size = sc.nextInt();
		sc.nextLine();
		String[] arr = new String[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter the string " + (index+1));
			
			arr[index] = sc.nextLine();
		}
		sc.close();
		indexHavingMaximumLength.getIndexOfMaxLength(arr);
	}
}
