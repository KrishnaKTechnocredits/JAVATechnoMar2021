package anubhav.StringOperations;

public class ReverseAllWordsInString {

	String output1 = "";
	String output2 = "";
	String wordToReverse;

	// Reverse one word only
	String reverseWords(String input) {
		StringBuffer wordReverse = new StringBuffer(input);
		wordReverse.reverse();
		wordToReverse = wordToReverse + wordReverse + ' ';
		//System.out.println(wordReverse + " ");
		return wordToReverse;
	}

	// Reverse each word in the string without Array
	void reverseUsingStringMethods(String input) {
		wordToReverse = "";
		String rev1 = "";
		input = input + ' ';
		for (int index = 0; index <= input.length() - 1; index++) {
			if (input.charAt(index) != ' ') {
				rev1 = rev1 + input.charAt(index);
			} else {
				output1 = reverseWords(rev1);
				rev1 = "";
			}
		}
		System.out.println(output1);
	}

	// Reverse each word in the string using Array`
	void reverseUsingArray(String input) {
		wordToReverse = "";
		String[] inputArray = input.split(" ");
		for (int index = 0; index <= inputArray.length - 1; index++) {
			output2 = reverseWords(inputArray[index]);
		}
		System.out.println(output2);
	}

	public static void main(String[] args) {
		ReverseAllWordsInString reverseAllWordsInString = new ReverseAllWordsInString();
		String input = "Hi hello how are you";
		
		System.out.println("--Output using String--");
		reverseAllWordsInString.reverseUsingStringMethods(input);
		
		System.out.println("--Output using array--");
		reverseAllWordsInString.reverseUsingArray(input);
	}
}