package pallavi.coding_exam_5;

/*Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy*/

public class ReverseEachInput {

	String getRevWordString(String str) {
		String rev = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			rev = rev + str.charAt(index);
		}

		return rev;
	}

	String takeString(String str) {
		String output = "";
		String arr[] = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String finalOutput = getRevWordString(arr[index]);
			output = output + finalOutput + " ";
		}
		return output;

	}

	public static void main(String[] args) {
		String input = "hi hello how are you";
		String finalOutput = new ReverseEachInput().takeString(input);
		System.out.println(finalOutput);
	}

}
