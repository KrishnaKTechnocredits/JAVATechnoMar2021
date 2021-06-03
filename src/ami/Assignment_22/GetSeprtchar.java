/*Assignment 21:  14th April'2021
WAP to print the below statement without character method.

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package ami.Assignment_22;

public class GetSeprtchar {
	int digits, upperCase, lowerCase, specialCharacters;

	void countString(String str) {
		for (int index = 0; index < str.length(); index++) {
			int ascii = str.charAt(index);
			if (ascii >= 48 && ascii <= 57)
				digits++;
			else {
				if (ascii >= 65 && ascii <= 90)
					upperCase++;
				else if (ascii >= 97 && ascii <= 122)
					lowerCase++;
				else
					specialCharacters++;
			}
		}
	}

	void count1() {
		System.out.println("Digits :" + digits);
		System.out.println("letters :" + (upperCase + lowerCase));
		System.out.println("upperCase :" + upperCase);
		System.out.println("lowerCase :" + lowerCase);
		System.out.println("specialCharacters :" + specialCharacters);
	}

	public static void main(String[] args) {
		GetSeprtchar count = new GetSeprtchar();
		count.countString("1rRpd3F9#K(E");
		count.count1();

	}
}
