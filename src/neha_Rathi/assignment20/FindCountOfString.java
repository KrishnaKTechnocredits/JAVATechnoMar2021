////Assignment 20:  14th April'2021
//1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
//Input: 1rRpd3F9#K(E
//Output : 
//Total digit: 3
//Total Letters: 7
//Total Uppercase: 4
//Total Lowercase: 3
//Total Special char: 2

package neha_Rathi.assignment20;

public class FindCountOfString {
	int upperCnt = 0;
	int lowerCnt = 0;
	int digitCnt = 0;
	int specialChar = 0;

	void findCount(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				upperCnt++;
			else if (Character.isLowerCase(ch))
				lowerCnt++;
			else if (Character.isDigit(ch))
				digitCnt++;
		}
		specialChar = (input.length() - (upperCnt + lowerCnt + digitCnt));
	}

	void display() {
		System.out.println("Total digit: " + digitCnt);
		System.out.println("Total Letters: " + (upperCnt + lowerCnt));
		System.out.println("Total Uppercase: " + upperCnt);
		System.out.println("Total Lowercase: " + lowerCnt);
		System.out.println("Total Special char: " + specialChar);
	}

	public static void main(String[] args) {
		FindCountOfString findCountOfString = new FindCountOfString();
		String input = "1rRpd3F9#K(E";
		findCountOfString.findCount(input);
		findCountOfString.display();
	}
}
