package madhavi_Raut.CodingExam.Exam_10;
/*Programming Test - 10 : 19th May'2021 (12 mins) 
Print the first non-repeated character of String.
Input :  abcgbca
output : g*/
public class FindFirstUniqueCharacter {

	char getFirstUniqueChar(String str) {
		char firstUniqueChar = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				firstUniqueChar = ch;
				break;
			}
		}
		return firstUniqueChar;
	}

	public static void main(String[] args) {
		char ch = new FindFirstUniqueCharacter().getFirstUniqueChar("abcgbca");
		if (ch == ' ')
			System.out.println("No unique character in the given string.");
		else
			System.out.println("First unique char in given string is: " + ch);
	}
}
