package monika.Array_Coding_Exam;

//Coding_Exam_5
/*
Write a java program to reverse each word of a given string
input : hi hello how are you
output : ih olleh woh era uoy
*/
public class ReverseEachString {

	String getReverseString(String input) {
		String output = "";
		String[] arr = input.split(" ");
		for (String word : arr) {
			StringBuilder s = new StringBuilder(word);
			output += s.reverse().toString() + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		ReverseEachString obj = new ReverseEachString();
		String input = "hi hello how are you";
		String result = obj.getReverseString(input);
		System.out.println(result);
	}
}
