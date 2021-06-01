/*Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
*/

package ami.Coding_Exam_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Return1Repeat1NonRepeatNum {
	
	String getUniqueWordString(String input){
		String str ="";
		String[] word = input.split(" ");
		boolean flagRepeat = false;
		boolean flagNotRepeat = false;
		LinkedList<String> list = new LinkedList<String>(Arrays.asList(word));
		for (String newWord : list) {
			if (list.indexOf(newWord) != list.lastIndexOf(newWord) && flagRepeat == false) {
				str = str + newWord + " ";
				flagRepeat = true;
			}
			if (list.indexOf(newWord) == list.lastIndexOf(newWord) && flagNotRepeat == false) {
				str = str + newWord + " ";
				flagNotRepeat = true;
			}
		}
		return str.trim();
	}
	
	public static void main(String[] args) {
		Return1Repeat1NonRepeatNum return1Repeat1NonRepeatNum = new Return1Repeat1NonRepeatNum();
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		System.out.println("output : " + return1Repeat1NonRepeatNum.getUniqueWordString(str));
	}

}
