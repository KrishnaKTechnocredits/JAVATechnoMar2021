/*
1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 */

package ami.Assignment_20;

public class GetSeprtChar {
	int letterCount, upperCount, lowerCount, specialCount, digitCount;

	void countRetrn(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (ch >= 48 && ch <= 57) {
				digitCount++;
			} else if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				if (ch >= 65 && ch <= 90) {
					upperCount++;
				} else {
					lowerCount++;
				}
				letterCount++;
			} else if (ch >= 32)
				specialCount++;
		}
	}

	void displayCount() {
		System.out.println(" Total Digit :" + digitCount + "\n Total Letters :" + letterCount + "\n Total UpperCase :" + upperCount
		+ "\n Total LowerCase :" + lowerCount + "\n Total special character count :" + specialCount);
	}

	public static void main(String[] args) {
		GetSeprtChar stringOperation = new GetSeprtChar();
		stringOperation.countRetrn("1rRpd3F9#K(E");
		stringOperation.displayCount();
	}

}
