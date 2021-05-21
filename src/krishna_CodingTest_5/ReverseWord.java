package krishna_CodingTest_5;

/*Write a java program to reverse each word of a given string
input : hi hello how are you
output : ih olleh woh era uoy
method signature String getRevWordString(String input){
}*/
public class ReverseWord {
	static String output = "";

	public void reverseString(String input) {

		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			getReverseWordString(inputArray[index]);
		}
	}
	
	String getReverseWordString(String word) {

		StringBuffer stringBuffer = new StringBuffer(word);
		stringBuffer.reverse();
		output = output + stringBuffer + " ";
		return output;
	}

	public static void main(String[] args) {
		ReverseWord reverseWord = new ReverseWord();
		reverseWord.reverseString("hi hello how are you");
		System.out.println("Input string is :"+"hi hello how are you");
		output = output.trim();
		System.out.println("Output after string reverse is :"+output);
	}
}
