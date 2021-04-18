package priyanka_Kamble.assignment_20;

import java.util.Scanner;

public class CountValues_way_2 {

	int countUppercase(String input) {
		int cntU = 0;
		for (int indexU = 0; indexU < input.length(); indexU++) {
			if (input.charAt(indexU) >= 65 && input.charAt(indexU) <= 90)
				cntU++;
		}
		System.out.println("upper Case Count = " + cntU);
		return cntU;
	}

	int lowerCase(String input) {
		int cntL = 0;
		for (int indexL = 0; indexL < input.length(); indexL++) {
			if (input.charAt(indexL) >= 97 && input.charAt(indexL) <= 122)
				cntL++;
		}
		System.out.println("Lower case Count = " + cntL);
		return cntL;
	}

	int upperLowerdigits(String input) {
		int cntC = 0;
		for (int indexC = 0; indexC < input.length(); indexC++) {
			if (input.charAt(indexC) >= 48 && input.charAt(indexC) <= 57)
				cntC++;
		}
		System.out.println("Digit Count = " + cntC);
		return cntC;
	}

	int digitSum(String input) {
		//upperLowerdigits(input);
		int sum = 0;
		for (int indexS = 0; indexS < input.length(); indexS++) {
			if (input.charAt(indexS) >= 48 && input.charAt(indexS) <= 57) {
				sum = +input.charAt(indexS);
			}
		}
		System.out.println("Sum of all digits in String is = " + sum);
		return sum;
	}

	int specialCharacter(String input) {
		//digitSum(input);
		int special = 0, cnt=0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) >= 65 && input.charAt(index) <= 90)
				cnt = 1;
			else if (input.charAt(index) >= 97 && input.charAt(index) <= 122)
				cnt = 1;
			else if (input.charAt(index) >= 48 && input.charAt(index) <= 57)
				cnt = 1;
			else
				cnt=0;
		}
		special++;
		if (cnt != 1)
			System.out.println("Special Case Count = " + special);
		return special;
	}

	public static void main(String[] args) {
		CountValues_way_2 character = new CountValues_way_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("1) Enter the String - ");
		String input = scanner.nextLine(); // char ch = input.charAt(0);
		// character.countUppercase(input); // character.lowerCase(input);
		int Sum = character.countUppercase(input) + character.lowerCase(input);
		System.out.println("Letters Count = " + Sum);
		character.upperLowerdigits(input);
		character.digitSum(input);
		character.specialCharacter(input);
		scanner.close();
	}
}
