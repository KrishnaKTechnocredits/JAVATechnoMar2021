package pavan.Assignment29;

import java.util.Scanner;

public class SumOfOddCapSmallEven {


	void getSumOfOddCapSmallEven(String input) {
		int sodd = sumOfOdd(input);
		int seven = sumOfEven(input);
		String upper = checkUpperCase(input);
		String lower = checkLowerCase(input);
		System.out.println(sodd + upper + lower + seven);
	}
	int sumOfOdd(String input) {
		int sumodd = 0;
		String temp = "0";
		int inttemp = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else {
				inttemp = Integer.parseInt(temp);
				if (inttemp % 2 != 0) {
					sumodd = sumodd + inttemp;
				}
				temp = "0";
			}
		}
		inttemp = Integer.parseInt(temp);
		if (inttemp % 2 != 0) {
			sumodd = sumodd + inttemp;
		}
		// System.out.println(sumodd);
		return sumodd;
	}
	int sumOfEven(String input) {
		int sumeven = 0;
		String temp = "0";
		int inttemp = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else {
				inttemp = Integer.parseInt(temp);
				if (inttemp % 2 == 0) {
					sumeven = sumeven + inttemp;
				}
				temp = "0";
			}
		}
		inttemp = Integer.parseInt(temp);
		if (inttemp % 2 == 0) {
			sumeven = sumeven + inttemp;
		}
		// System.out.println(sumeven);
		return sumeven;
	}
	String checkUpperCase(String input) {
		String isUppperinp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				isUppperinp = isUppperinp + ch;
			}

		} // System.out.println(isUppperinp);
		return isUppperinp;
	}
	String checkLowerCase(String input) {
		String isLowerinp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch)) {
				isLowerinp = isLowerinp + ch;
			}

		} // System.out.println(isLowerinp);
		return isLowerinp;
	}
	public static void main(String[] args) {
		SumOfOddCapSmallEven obj = new SumOfOddCapSmallEven();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input String");
		String input = scan.next();
		obj.getSumOfOddCapSmallEven(input);
	}
}
