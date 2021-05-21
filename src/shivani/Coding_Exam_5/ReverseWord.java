package shivani.Coding_Exam_5;

/*Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
*/
public class ReverseWord {
	String rev = "";

	String getString(String inputString) {
		String arr[] = inputString.split(" ");
		for (int i = 0; i < arr.length; i++) {
			rev = rev + " " + reverseGivenString(arr[i]);

			rev = rev.trim();

		}
		return rev;
	}

	StringBuffer reverseGivenString(String inputString) {

		StringBuffer sb1 = new StringBuffer(inputString);
		sb1.reverse();
		return sb1;

	}

	public static void main(String[] args) {
		ReverseWord reverseWord = new ReverseWord();
		String rev = reverseWord.getString("hi hello how are you");

		System.out.println("output " + rev);

	}
}