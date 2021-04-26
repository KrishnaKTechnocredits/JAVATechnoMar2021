package ashish_Vyas.coding_exam_2;

import java.util.Scanner;

public class SumOfAllTheInteger {
	private static Scanner scanner;

	int getSumOfAllInteger(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				if (index < str.length() - 1 && Character.isDigit(str.charAt(index + 1))) {
					sum = sum + Character.getNumericValue(str.charAt(index)) * 10
							+ Character.getNumericValue(str.charAt(index + 1));
					index += 1;
				} else
					sum = sum + Character.getNumericValue(str.charAt(index));
		}
		return sum;
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter Your String Here : ");
		String str = scanner.next();
		SumOfAllTheInteger sumOfAllinInteger = new SumOfAllTheInteger();
		System.out.println("Sum of all the Interger from String is : " + sumOfAllinInteger.getSumOfAllInteger(str));
	}

}
