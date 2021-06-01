package krishna.Assignment_17;

import java.util.Scanner;
/*
Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/

public class ArrayStringMaxLength {
	
	String maxStringLen(String[] name) {
		String nameMax = name[0];
		for (int index = 1; index < name.length; index++) {
			if (nameMax.length() < name[index].length()) {
				nameMax = name[index];
			}
		}
		return nameMax;
	}

	public static void main(String[] args) {
		ArrayStringMaxLength arrayStringMaxLength = new ArrayStringMaxLength();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter :");
		int count = scanner.nextInt();
		String[] name = new String[count];

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the name :");
			name[index] = scanner.next();
		}
		String nameMax = arrayStringMaxLength.maxStringLen(name);
		System.out.println("Maximum length name is :" + nameMax);

	}

}
