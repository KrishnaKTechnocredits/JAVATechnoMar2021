package krishna.Assignment_21;
/*1)	Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
2)	Input: 1rRpd3F9#K(E
Without character class*/

import java.util.Scanner;

public class CountFromString {
	static int upperCount, lowerCount, digitCount, specialCount;

	void countOfString(String stringWord) {

		for (int index = 0; index < stringWord.length(); index++) {
			char ch = stringWord.charAt(index);
			if (ch >= 'A' && ch <= 'Z')
				upperCount++;
			else if (ch >= 'a' && ch <= 'z')
				lowerCount++;
			else if (ch >= '0' && ch <= '9')
				digitCount++;
			else
				specialCount++;
		}

	}

	public static void main(String[] args) {
		CountFromString countFromString = new CountFromString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String Word : ");
		String stringWord = scanner.next();

		countFromString.countOfString(stringWord);
		System.out.println("Total Digit count is :" + digitCount);
		System.out.println("Total upper count is  :" + upperCount);
		System.out.println("Total lower count is  :" + lowerCount);
		System.out.println("Total letter count is  :" + (upperCount + lowerCount));
		System.out.println("Total specialchar count is  :" + specialCount);
	}

}
