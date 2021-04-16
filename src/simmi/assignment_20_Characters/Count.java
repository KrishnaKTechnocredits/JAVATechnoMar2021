/*Assignment 20: 14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package simmi.assignment_20_Characters;

public class Count {
	int digits, upperCase, lowerCase, specialCharacters;
	
	void countString(String str) {
		for (int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index)))
				digits++;
			else {
				if (Character.isUpperCase(str.charAt(index)))
					upperCase++;
				else if (Character.isLowerCase(str.charAt(index)))
					lowerCase++;
				else
					specialCharacters++;
			}
		}
	}

	void count1() {
		System.out.println("Digits " + digits);
		System.out.println("letters " + (upperCase + lowerCase));
		System.out.println("upperCase " + upperCase);
		System.out.println("lowerCase " + lowerCase);
		System.out.println("specialCharacters " + specialCharacters);
	}

	public static void main(String[] args) {
		Count count = new Count();
		count.countString("1rRpd3F9#K(E");
		count.count1();
	}

}
