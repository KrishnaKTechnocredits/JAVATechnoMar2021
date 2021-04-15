package komal.Assignment_17;

import java.util.Scanner;

/*Program 9: return the index having maximum and minimum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/

public class MaxLengthFromGivenStringArray {
	
	int maxNameIndex(String[] inputName) {
			String maxName = inputName[0];
			int maxNameIndex = 0;
			for (int index = 1; index < inputName.length; index++) {
				if (maxName.length() < inputName[index].length())
					maxNameIndex = index;
			}
			return maxNameIndex;
		}

		int minNameIndex(String[] inputName) {
			String minName = inputName[0];
			int minNameIndex = 0;
			for (int index = 1; index < inputName.length; index++) {
				if (minName.length() > inputName[index].length())
					minNameIndex = index;
			}
			return minNameIndex;
		}

		public static void main(String[] args) {
			MaxLengthFromGivenStringArray maxLengthFromGivenStringArray = new MaxLengthFromGivenStringArray();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("How Many Names You want to Enter:-");
			int size = scanner.nextInt();
			String[] inputName = new String[size];

			for (int index = 0; index < inputName.length; index++) {
				System.out.println("Enter Name " + (index + 1));
				inputName[index] = scanner.next();
			}
			int inputMaxNameIndex = maxLengthFromGivenStringArray.maxNameIndex(inputName);
			System.out.println("Maximum Name Length Index in Given Array is :- " + inputMaxNameIndex);
			int inputMinNameIndex = maxLengthFromGivenStringArray.minNameIndex(inputName);
			System.out.println("Minimum Name Length Index in Given Array is :- " + inputMinNameIndex);
			scanner.close();
		}

	}
