/*Java Assignment 28:  24th April'2021

Write a method to return String having all numeric numbers first followed by
Capital letter followed by Small letter.

String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis

*/

package vaibhav.Assignment_28;

public class StringModification {

	String modifyString(String str) {
		String digitStr = "";
		String capitalLetterStr = "";
		String smallLetterStr = "";
		String outputStr;

		for (int index = 0; index < str.length(); index++) {
			char ch;
			ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				digitStr = digitStr + ch;
			} else if (Character.isUpperCase(ch)) {
				capitalLetterStr = capitalLetterStr + ch;
			} else if (Character.isLowerCase(ch)) {
				smallLetterStr = smallLetterStr + ch;
			}
		}

		outputStr = digitStr + capitalLetterStr + smallLetterStr;

		return outputStr;
	}

	public static void main(String[] args) {
		StringModification stringModification = new StringModification();

		String str = "Te1Ch2noCr4e_%$d8iTs9";

		// String outputStr = stringModification.modifyString(str);
		
		System.out.println("input  : " + str);
		System.out.println("output : " + stringModification.modifyString(str));
	}
}
