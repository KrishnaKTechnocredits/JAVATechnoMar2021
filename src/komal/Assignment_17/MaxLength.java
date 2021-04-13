package komal.Assignment_17;

import java.util.Scanner;

/*Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class MaxLength {
	
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
			MaxLength maxLength = new MaxLength();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("How Many Names You want to Enter:-");
			int size = scanner.nextInt();
			String[] inputName = new String[size];

			for (int index = 0; index < inputName.length; index++) {
				System.out.println("Enter Name " + (index + 1));
				inputName[index] = scanner.next();
			}
			String maxName = maxLength.maxLengthName(inputName);
			System.out.println("Maximum Name Length in given Array is:- " + maxName);
			String minName = maxLength.minLengthName(inputName);
			System.out.println("Minimum Name Length in given Array is:- " + minName);
			scanner.close();

		}

	}