package krati_Jain.codingExam10;

public class FirstNonRepeatedChar {

	static boolean isCharUnique = false;

	public static void main(String[] args) {
		String inputStr = "abcgbca";
		FirstNonRepeatedChar firstNonRepeatedChar = new FirstNonRepeatedChar();
		// System.out.println(firstNonRepeatedChar.getNonRepeatedChar(inputStr));
		char ch = firstNonRepeatedChar.getNonRepeatedChar(inputStr);
		if (isCharUnique)
			System.out.println("First Non repeated chatacter in the String is : " + ch);
		else
			System.out.println("There is no unique character in the String");
	}

	public char getNonRepeatedChar(String inputStr) {
		char chartoCheck = ' ';

		for (int index = 0; index < inputStr.length(); index++) {
			chartoCheck = inputStr.charAt(index);
			if (inputStr.indexOf(chartoCheck) == inputStr.lastIndexOf(chartoCheck)) {
				isCharUnique = true;
				break;
			}
		}
		return chartoCheck;

	}
}
