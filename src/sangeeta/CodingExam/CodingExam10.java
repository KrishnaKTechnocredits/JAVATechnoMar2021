/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/

package sangeeta.CodingExam;

public class CodingExam10 {

	void nonRepeatedChar(String str) {
		char nonRepeatedChar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				nonRepeatedChar = ch;
				break;
			}
		}

		System.out.println("First non repeated character is: " + nonRepeatedChar);
	}

	public static void main(String[] args) {
		CodingExam10 codingExam10 = new CodingExam10();
		String str = "abcgbca";
		codingExam10.nonRepeatedChar(str);
	}

}
