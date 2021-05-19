/* test 5
 Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy

*/

package ami.Coding_Exam_5;

public class Coding_Exam_5 {

	public void reverseWord(String str) {
		String[] words = str.split(" ");
		String reversedString = "";
		for (int index = 0; index < words.length; index++) {
			String word = words[index];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String[] args) {
		Coding_Exam_5 reverse = new Coding_Exam_5();
		reverse.reverseWord("hi hello how are you");
	}

}
