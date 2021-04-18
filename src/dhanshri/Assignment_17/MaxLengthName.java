package dhanshri.Assignment_17;

import java.util.Scanner;

public class MaxLengthName {

	String nameLength(String[] input) {
		String maxLengthNum = input[0];
		for (int index = 0; index < input.length; index++) {
			if (input[index].length() > maxLengthNum.length()) {
				maxLengthNum = input[index];
			}

		}
		return maxLengthNum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter array lenth:");
		int size = scanner.nextInt();
		String[] array = new String[size];
		System.out.println("enter elements of an  array");

		for (int i = 0; i < size; i++) {
			array[i] = scanner.next();
		}
		scanner.close();
		String name = new MaxLengthName().nameLength(array);
		System.out.println("Max name lenth name is :" + name);

	}

}
