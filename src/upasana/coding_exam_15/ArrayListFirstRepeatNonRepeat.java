/*
 Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */

package upasana.coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListFirstRepeatNonRepeat {

	String getOutput(String str) {

		String[] strArr = str.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArr));
		String output = "";

		for (String name : list) {
			if (list.indexOf(name) != list.lastIndexOf(name)) {
				output = name + " ";
				break;
			}
		}
		for (String name : list) {
			if (list.indexOf(name) == list.lastIndexOf(name)) {
				output += name + " ";
				break;
			}

		}
		return output;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = new ArrayListFirstRepeatNonRepeat().getOutput(str);
		System.out.println(output);
	}

}
