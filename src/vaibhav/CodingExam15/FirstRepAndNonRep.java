/*28th May Coding Exam-15 : Collection

Program 2 : 
Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits

*/

package vaibhav.CodingExam15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class FirstRepAndNonRep{

	String getFirstRepeatingAndNonRepeatingWord(String[] input) {
		String output1 = "";
		String output2 = "";
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(input));

		for (String name : input) {
			if (arrList.indexOf(name) != arrList.lastIndexOf(name)) {
				output1 = name;
				break;
			}
		}

		for (String name : input) {
			if (arrList.indexOf(name) == arrList.lastIndexOf(name)) {
				output2 = name;
				break;
			}
		}

		return output1 + " " + output2;
	}

	public static void main(String[] args) {
		
		FirstRepAndNonRep firstRepAndNonRep = new FirstRepAndNonRep();
		
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String[] arrStr = str.split(" ");
		
		String output = firstRepAndNonRep.getFirstRepeatingAndNonRepeatingWord(arrStr);
		
		System.out.println("First Repeating and Non-Repeating Words form given String : " + output);

	}
}
