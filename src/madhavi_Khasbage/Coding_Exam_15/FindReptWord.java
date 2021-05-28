package madhavi_Khasbage.Coding_Exam_15;
import java.util.ArrayList;
import java.util.Arrays;
/*Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

public class FindReptWord {

	String getRepetWords(String my_str) {
		String output = "";
		String[] arr = my_str.split(" ");		
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		int index=0;
		for (String rWords : arrList) {
			if((arrList.indexOf(rWords) != arrList.lastIndexOf(rWords )) && index==0) {
				output += rWords + " ";
			}
			if(arrList.indexOf(rWords) == arrList.lastIndexOf(rWords )) {
				output += rWords + " ";
				break;
			}
			index++;
		}			
		return output ;
	}

	public static void main(String[] args) {

		FindReptWord findReptWord = new FindReptWord();
		System.out.println("Input : Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi\n");
		String strWords = findReptWord.getRepetWords("Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi");
		
		System.out.println("First repeating and non repeating word from given input:");
		System.out.println(strWords);
	}

}
