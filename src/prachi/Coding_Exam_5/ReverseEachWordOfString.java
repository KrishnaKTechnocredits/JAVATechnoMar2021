package prachi.Coding_Exam_5;

/*"Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy"
 */

public class ReverseEachWordOfString{

	String getReverseWord(String str) {
		String[] strArr = str.split(" ");
		String newString = "";
		for (int index = 0; index < strArr.length; index++) {
			
			StringBuffer sb = new StringBuffer(strArr[index]);
			newString = newString + sb.reverse().toString() + " ";
			
		}
		return newString;
	}

	public static void main(String[] args) {
		ReverseEachWordOfString reverse = new ReverseEachWordOfString();
		String output=reverse.getReverseWord("hi hello how are you");
		System.out.println(output);
	}
}
