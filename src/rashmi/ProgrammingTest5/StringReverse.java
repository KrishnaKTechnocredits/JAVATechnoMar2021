/*
 	Write a java program to reverse each word of a given string

	input : hi hello how are you

	output : ih olleh woh era uoy

	method signature String getRevWordString(String input){
}*/

package rashmi.ProgrammingTest5;

public class StringReverse {
	static String output = "";

	private String getReverseWordString(String word) {

		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		output = output + sb + " ";
		return output;
	}

	public void reverseString(String input) {

		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			getReverseWordString(inputArray[index]);
		}
	}

	public static void main(String[] args) {
		StringReverse stringReverse = new StringReverse();
		stringReverse.reverseString("hi hello how are you");
		System.out.println(output = output.trim());

	}

}
