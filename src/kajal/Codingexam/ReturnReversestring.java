/*
	 Program : 5 [ Medium Complexity]

	Write a java program to reverse each word of a given string

	input : hi hello how are you

	output : ih olleh woh era uoy

	 */
package kajal.Codingexam;

public class ReturnReversestring {

	String getRevWordString(String input) {
		String output = "";
		String[] splitString = input.split(" ");
		for (int index = 0; index < splitString.length; index++) {
			StringBuffer sb = new StringBuffer(splitString[index]);
			sb.reverse();
			output += sb + " ";

		}
		return output;
	}

	public static void main(String[] args) {
		ReturnReversestring reverse = new ReturnReversestring();
		String temp = reverse.getRevWordString("hi hello how are you");
		System.out.println("Output: " + temp);
	}
}
