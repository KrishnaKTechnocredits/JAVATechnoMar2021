/*Coding Exam - 10 : 19th May'2021 [ 12 mins ]

Print the first non-repeated character of String.
Input : abcgbca
output : g

*/

package vaibhav.CoadingExam10;

public class NonRepetedChar {

	int charPresentCount(char charArr[], char ch) {
		int count = 0;
		for (int index = 0; index < charArr.length; index++) {
			if (charArr[index] == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		NonRepetedChar nonRepetedChar = new NonRepetedChar();

		String input = "abcgbca";
		char[] chArr = input.toCharArray();

		for (int index = 0; index < chArr.length; index++) {

			int charCount = nonRepetedChar.charPresentCount(chArr, chArr[index]);

			if (charCount == 1) {
				System.out.println("First non-repeted charater of string is : " + chArr[index]);
				break;
			}
		}
	}
}
