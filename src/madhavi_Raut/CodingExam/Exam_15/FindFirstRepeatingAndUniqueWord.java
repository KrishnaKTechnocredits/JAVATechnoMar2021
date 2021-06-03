package madhavi_Raut.CodingExam.Exam_15;

/*Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/
import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstRepeatingAndUniqueWord {

	String getFirstRepeatingAndUniqueWord(String str) {
		String[] strArr = str.split(" ");
		String firstRepeatWord = null, firstUniqueWord = null;
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(strArr));
		for (int index = 0; index < strArr.length; index++) {
			if ((firstRepeatWord == null)
					&& arrList.indexOf(arrList.get(index)) != (arrList.lastIndexOf(arrList.get(index)))) {
				firstRepeatWord = arrList.get(index);
			} else if ((firstUniqueWord == null)
					&& arrList.indexOf(arrList.get(index)) == (arrList.lastIndexOf(arrList.get(index)))) {
				firstUniqueWord = arrList.get(index);
			}
			if (firstRepeatWord != null && firstUniqueWord != null)
				break;
		}
		return firstRepeatWord + " " + firstUniqueWord;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		System.out.println("String with firstRepeating and Unique word");
		System.out.println(new FindFirstRepeatingAndUniqueWord().getFirstRepeatingAndUniqueWord(str));
	}
}
