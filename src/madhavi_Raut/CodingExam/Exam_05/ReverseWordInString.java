package madhavi_Raut.CodingExam.Exam_05;
/*Write a java program to reverse each word of a given string
input : hi hello how are you
output : ih olleh woh era uoy*/

public class ReverseWordInString {

	String getReverseWordInString(String str) {
		String[] strArray = str.split(" ");
		String newString = "";
		for (int index = 0; index < strArray.length; index++) {
			StringBuffer sb = new StringBuffer(strArray[index]);
			newString += sb.reverse().toString() + " ";
		}
		return newString.trim();
	}

	public static void main(String[] args) {
		System.out.println("Below is the new string by reversing each word:");
		System.out.println(new ReverseWordInString().getReverseWordInString("hi hello how are you"));
	}
}