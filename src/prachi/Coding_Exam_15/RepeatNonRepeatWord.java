package prachi.Coding_Exam_15;

import java.util.ArrayList;
import java.util.Arrays;

/*"Return first repeating and non repeating word from given input."
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

public class RepeatNonRepeatWord {
	static String stringInput = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";

	static String getRepetWords(String str) {
		String output = "";
		String[] arr = str.split(" ");		
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		int index=0;
		for (String words : arrList) {
			if((index==0 && arrList.indexOf(words) != arrList.lastIndexOf(words))) {
				output = output + words + " ";
			}
			if(arrList.indexOf(words) == arrList.lastIndexOf(words )) {
				output = output + words + " ";
				break;
			}
			index++;
		}			
		return output ;
	}

	public static void main(String[] args) {
		System.out.println("Output : "+RepeatNonRepeatWord.getRepetWords(stringInput));
	}
}