/*Input string - "I am a boy"
output - 4 words*/

package sandesh.OWN_Practice_Sandesh_1;

public class StringCount {

	int getWordCount(String inputString){
		String normalisedString = inputString.trim().replaceAll("\\s+", " ");
		String[] arrayOfWords = normalisedString.split(" ");
		return arrayOfWords.length;
	}

	public static void main(String[] args){
		String input = " 123 I am a   boy   @@@    kla       ";
		int countOfWords = new StringCount().getWordCount(input);
		System.out.println("Count of words is -: " + countOfWords);
	}

}
