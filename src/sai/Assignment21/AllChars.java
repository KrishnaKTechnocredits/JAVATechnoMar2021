package sai.Assignment21;

/*
 * Assignment 21: 14th April'2021 
Assignment 20 (both program) without using Character class method.

 */

public class AllChars {

	int upperCount = 0, lowerCount = 0, numCount = 0, specialCount = 0;

	void calculateCount(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				upperCount++;
			} else if (ch >= 97 && ch <= 122) {
				lowerCount++;
			} else if (ch >= 48 && ch <= 57) {
				numCount++;
			} else {
				specialCount++;
			}
		}
	}

	void display() {
		System.out.println("Total digit: " + numCount);
		System.out.println("Total Letters: " + (upperCount + lowerCount));
		System.out.println("Total Uppercase: " + upperCount);
		System.out.println("Total Lowercase: " + lowerCount);
		System.out.println("Total Special char: " + specialCount);
	}

	public static void main(String[] args) {
		AllChars allChars = new AllChars();
		String input = "1rRpd3F9#K(E";
		allChars.calculateCount(input);
		allChars.display();
	}
}
