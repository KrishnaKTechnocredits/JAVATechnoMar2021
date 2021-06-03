package komal.coding_exam_15;

/*Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/
import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingNNonReapWords {
	String getRepAndNonRepWord(ArrayList<String> list) {
		String outputStr = " ";
		boolean repWord = false;
		boolean nonRepWord = false;

		for (String name : list) {
			if (list.indexOf(name) != list.lastIndexOf(name) && nonRepWord == false) {
				outputStr = outputStr + name + " ";
				nonRepWord = true;
			}
			if (list.indexOf(name) == list.lastIndexOf(name) && repWord == false) {
				outputStr = outputStr + name + " ";
				repWord = true;
			}
		}
		return outputStr;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String[] arrOfNames = str.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrOfNames));
		RepeatingNNonReapWords repeatingNNonReapWords = new RepeatingNNonReapWords();
		System.out.println(repeatingNNonReapWords.getRepAndNonRepWord(list));
	}
}
