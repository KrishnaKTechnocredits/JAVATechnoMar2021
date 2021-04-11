/*Program 8:  return the name having maximum and minimum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : maximum length=Technocredits
         minimum length=Harsh
 */
package aparna.arrayExamples;

import java.util.Scanner;

public class MaxMinLengthName {

	String maxLengthName(String[] inputName) {
		String maxName = inputName[0];
		for (int index = 1; index < inputName.length; index++) {
			if (maxName.length() < inputName[index].length())
				maxName = inputName[index];
		}
		return maxName;
	}

	String minLengthName(String[] inputName) {
		String minName = inputName[0];
		for (int index = 0; index < inputName.length; index++) {
			if (minName.length() > inputName[index].length())
				minName = inputName[index];
		}
		return minName;
	}

	public static void main(String[] args) {
		MaxMinLengthName maxMinLengthName = new MaxMinLengthName();
		// String[] inputName1 = { "Maulik", "Krishna", "Technocredits", "Kangan",
		// "Harsh" };
		// String maxName1 = maxMinLengthName.maxLengthName(inputName1);
		// System.out.println("Maximum Name Length in given Array is:- " + maxName1);
		// String minName1 = maxMinLengthName.minLengthName(inputName1);
		// System.out.println("Minimum Name Length in given Array is:- " + minName1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Names You want to Enter:-");
		int size = scanner.nextInt();
		String[] inputName = new String[size];

		for (int index = 0; index < inputName.length; index++) {
			System.out.println("Enter Name " + (index + 1));
			inputName[index] = scanner.next();
		}
		String maxName = maxMinLengthName.maxLengthName(inputName);
		System.out.println("Maximum Name Length in given Array is:- " + maxName);
		String minName = maxMinLengthName.minLengthName(inputName);
		System.out.println("Minimum Name Length in given Array is:- " + minName);
		scanner.close();

	}

}
