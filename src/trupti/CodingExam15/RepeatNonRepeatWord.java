package trupti.CodingExam15;
/*Return first repeating and non repeating word from given input
 * String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi"
 * Output : Hi Credits*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RepeatNonRepeatWord {

	String getFirstRepeatNonRepeat(String input) { //input = "Hi Hello Hi There"
		String output = "";
		String[] inputArray = input.split(" ");

		HashSet<String> inputHashSet = new HashSet<String>(Arrays.asList(inputArray));
		ArrayList<String> repeatWords = new ArrayList<String>();
		ArrayList<String> nonRepeatWords = new ArrayList<String>();
		for(String word: inputHashSet) {
			if(input.indexOf(word) == input.lastIndexOf(word))
				nonRepeatWords.add(word);
			else
				repeatWords.add(word);
		}
		
		output = repeatWords.get(0) + " " + nonRepeatWords.get(0);

		return output;
		}

	public static void main(String[] args) {
		String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = new RepeatNonRepeatWord().getFirstRepeatNonRepeat(input);
		System.out.println(output);

	}

}
