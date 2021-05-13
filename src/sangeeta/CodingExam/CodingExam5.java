/*Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy*/

package sangeeta.CodingExam;

public class CodingExam5 {

	String getRevWordString(String input) {
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		return sb.toString();
	}

	void splitString(String str) {
		String output = " ";
		String[] strarr = str.split(" ");
		for (int index = 0; index < strarr.length; index++) {
			String revString = getRevWordString(strarr[index]);
			output = output + " " + revString;
		}
		System.out.println("Reversed string is:-" + output);
	}

	public static void main(String[] args) {
		CodingExam5 codingExam5 = new CodingExam5();
		System.out.println("Input string is:- hi hello how are you");
		String str = "hi hello how are you";
		codingExam5.splitString(str);
	}

}
