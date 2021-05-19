/*Program : 2 [ Medium Complexity]
Write a java program to reverse each word of a given string
input : hi hello how are you
output : ih olleh woh era uoy*/

package krati_Jain.codingExam5;

public class ReverseEachStrInStr {

	static String inputStr = "  hi hello how are you ";

	public static void main(String[] args) {
		ReverseEachStrInStr reverseEachStr = new ReverseEachStrInStr();
		inputStr = inputStr.trim();
		System.out.println(inputStr);
		System.out.println(reverseEachStr.refineStrCode5(inputStr));
	}

	String refineStrCode5(String inputStr) {
		String temp = "";
		for (int index = 0; index < inputStr.length(); index++) {
			char tempChar = inputStr.charAt(index);
			temp += tempChar;
			if (tempChar == ' ') {
				System.out.println(reverStr(temp));
				temp = "";
			}
		}
		StringBuffer sb1 = new StringBuffer(temp);
		return sb1.reverse().toString();
	}

	String reverStr(String temp) {

		StringBuffer sb1 = new StringBuffer(temp.trim());
		// System.out.println(sb1.reverse().toString());
		return sb1.reverse().toString();

	}

}
