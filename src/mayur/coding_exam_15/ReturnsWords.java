package mayur.coding_exam_15;

import java.util.Arrays;
import java.util.ArrayList;

public class ReturnsWords {
	static String stringInput = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";

	static String getReturnWords(String str) {
		String output = "";
		String[] arr = str.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		int index = 0;
		for (String words : arrList) {
			if ((index == 0 && arrList.indexOf(words) != arrList.lastIndexOf(words))) {
				output = output + words + " ";
			}
			if (arrList.indexOf(words) == arrList.lastIndexOf(words)) {
				output = output + words + " ";
				break;
			}
			index++;
		}
		return output;
	}

	public static void main(String[] args) {
		System.out.println("Output : " + ReturnsWords.getReturnWords(stringInput));
	}
}
