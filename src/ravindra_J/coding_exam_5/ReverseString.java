/*Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
 */

package ravindra_J.coding_exam_5;

public class ReverseString {

	public static void main(String[] args) {
		String input = "hi hello how are you";

		ReverseString reversestring = new ReverseString();
		System.out.println(reversestring.getOutputString(input));
	}

	String getOutputString(String str) {
		String out = "";
		String strArr[] = str.split(" ");
		for (int index = 0; index < strArr.length; index++) {
				String temp = getReverseString(strArr[index]);
			    out += " "+temp;
				//System.out.println(getReverseString(strArr[index]));
		}
		return out.trim();
	}

	String getReverseString(String str1) {
		StringBuffer sb = new StringBuffer(str1);
		String temp = sb.reverse().toString();

		return temp;
	}

}
