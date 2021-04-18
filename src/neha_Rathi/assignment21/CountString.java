//Assignment 21
//1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
//Input: 1rRpd3F9#K(E
//Output : 
//Total digit: 3
//Total Letters: 7
//Total Uppercase: 4
//Total Lowercase: 3
//Total Special char: 2

package neha_Rathi.assignment21;

public class CountString {
	int upperCnt = 0;
	int lowerCnt = 0;
	int numCnt = 0;
	int specialCnt = 0;

	void calculateCount(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				upperCnt++;
			} else if (ch >= 97 && ch <= 122) {
				lowerCnt++;
			} else if (ch >= 48 && ch <= 57) {
				numCnt++;
			}
		}
		specialCnt = input.length() - (upperCnt + lowerCnt + numCnt);
	}

	void display() {
		System.out.println("Total digit: " + numCnt);
		System.out.println("Total Letters: " + (upperCnt + lowerCnt));
		System.out.println("Total Uppercase: " + upperCnt);
		System.out.println("Total Lowercase: " + lowerCnt);
		System.out.println("Total Special char: " + specialCnt);
	}

	public static void main(String[] args) {
		CountString countString = new CountString();
		String input = "1rRpd3F9#K(E";
		countString.calculateCount(input);
		countString.display();
	}
}
