/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from
 *  predefined string.without using Character class method.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
package shilpa.Assignment_21;

public class CountinStrWithoutCharClass {
	void getCountFromString(String str) {
		int digits = 0;
		int letters = 0;
		int Ucase = 0;
		int Lcase = 0;
		int spChar = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57) {
				digits++;
			} else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
				letters++;
				if (ch >= 'A' && ch <= 'Z')
					Ucase++;
				else
					Lcase++;
			} else {
				spChar++;
			}
		}
		System.out.println("Total Digit: " + digits);
		System.out.println("Total Letters: " + letters);
		System.out.println("Total Uppercase: " + Ucase);
		System.out.println("Total Lowercase: " + Lcase);
		System.out.println("Total Special Characters: " + spChar);
	}

	public static void main(String[] args) {
		CountinStrWithoutCharClass cnt = new CountinStrWithoutCharClass();
		cnt.getCountFromString("1rRpd3F9#K(E");
	}
}
