package priyanka_Panat.assignment21;

import java.util.Scanner;

public class SumOfNumInString {
	int countSumOfNum(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int asciiValue = ch;
			if (asciiValue >= 48 && asciiValue <= 57) {
				int num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num;
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		SumOfNumInString sumOfNumInString = new SumOfNumInString();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String");
		String str = sc.next();
		int result = sumOfNumInString.countSumOfNum(str);
		System.out.println("Sum of all digits in String is : " + result);
		sc.close();
	}
}

