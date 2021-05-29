package ravindra_J.coding_exam_15_List;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class FirstRepeatingNonRepeatingString {
		int firstIndex, lastIndex;
		
		public String getRepeatedStringInSentence(List<String> list1) {
			String repeatedString = "";
			for (int index = 0; index < list1.size(); index++) {
				firstIndex = list1.indexOf(list1.get(index));
				lastIndex = list1.lastIndexOf(list1.get(index));
				if (firstIndex != lastIndex) {
					repeatedString = list1.get(firstIndex);
					break;
				}
			}
			return repeatedString;
		}
		public String getNonRepeatedStringInSentence(List<String> list1) {
			String nonDuplicateString = "";
			for (int index = 0; index < list1.size(); index++) {
				firstIndex = list1.indexOf(list1.get(index));
				lastIndex = list1.lastIndexOf(list1.get(index));
				if (firstIndex == lastIndex) {
					nonDuplicateString = list1.get(firstIndex);
					break;
				}
			}
			return nonDuplicateString;
		}

		public static void main(String args[]) {
			String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
			String[] StringArr = str.split(" ");
			List<String> list = new LinkedList<String>(Arrays.asList(StringArr));
			FirstRepeatingNonRepeatingString frnrs = new FirstRepeatingNonRepeatingString();
			String outputRepeatingString = frnrs.getRepeatedStringInSentence(list);
			String outputNonRpeatingString = frnrs.getNonRepeatedStringInSentence(list);
			System.out.println(" First Repeating String: "+outputRepeatingString + "\n First Non Repeating String: " + outputNonRpeatingString);
		}
	}

