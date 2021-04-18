/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package rahul_Hiremath.assignment_20;

public class Ass_20_1 {

	int ascii;
	int numCount;
	int upperCaseCount;
	int lowerCaseCount;
	int specialCharCount;

	void checkAsciiValue(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			ascii = (char) ch;
			countInfo();
		}
	}

	void countInfo() {
		if (ascii >= 48 && ascii <= 57) 		// digits ascii
			numCount++;
		else if (ascii >= 65 && ascii <= 90) 	// uppercase ascii
			upperCaseCount++;
		else if (ascii >= 97 && ascii <= 122) 	// lowercase ascii
			lowerCaseCount++;
		else 									// special characters
			specialCharCount++;
	}

	void display() {
		System.out.println("Total digit: " + numCount);
		int totalLetters = lowerCaseCount + upperCaseCount;
		System.out.println("Total Letters: " + totalLetters);
		System.out.println("Total Uppercase: " + upperCaseCount);
		System.out.println("Total Lowercase: " + lowerCaseCount);
		System.out.println("Total Special char: " + specialCharCount);
	}

	public static void main(String[] args) {
		Ass_20_1 ass_20_1 = new Ass_20_1();
		ass_20_1.checkAsciiValue("1rRpd3F9#K(E");
		ass_20_1.display();
	}
}
