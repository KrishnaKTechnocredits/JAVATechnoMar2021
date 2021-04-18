package pallavi.Assignment_21;

/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class CountDiffCharNoCharFunc {
	static int countDigit = 0, countU = 0, countL = 0, countSpeacial = 0;

	void count(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (ch >= 48 && ch <= 57) {
				countDigit++;
			} else if (ch >= 65 && ch <= 90) {
				countU++;
			}

			else if (ch >= 97 && ch <= 122) {
				countL++;
			} else {
				countSpeacial++;
			}
		}

	}

	public static void main(String[] args) {
		String name = "1rRpd3F9#K(E";
		new CountDiffCharNoCharFunc().count(name);
		System.out.println("Total Digit " + countDigit);
		System.out.println("Total letter " + (countU + countL));
		System.out.println("Total uppercase " + countU);
		System.out.println("Total Lowercase " + countL);
		System.out.println("Total Special Char " + countSpeacial);

	}

}
