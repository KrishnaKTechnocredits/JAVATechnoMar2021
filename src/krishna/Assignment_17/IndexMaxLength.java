package krishna.Assignment_17;

import java.util.Scanner;
/*
Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
 */
public class IndexMaxLength {

	int indexMaxLen(String[] name) {
		String nameMax = name[0];
		int nameMaxIndex = 0;
		for (int index = 1; index < name.length; index++) {
			if (nameMax.length() < name[index].length()) {
				nameMax = name[index];
				nameMaxIndex = index;
			}
		}
		return nameMaxIndex;
	}

	public static void main(String[] args) {
		IndexMaxLength indexMaxLength = new IndexMaxLength();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter :");
		int count = scanner.nextInt();
		String[] name = new String[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the name :");
			name[index] = scanner.next();
		}
		int nameMaxIndex = indexMaxLength.indexMaxLen(name);
		System.out.println("Index for maximum string is :" + nameMaxIndex);
	}
}
