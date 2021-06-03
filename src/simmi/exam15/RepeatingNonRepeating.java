/*Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

package simmi.exam15;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingNonRepeating {
	ArrayList<String> getRepeatingNonRepeating(String input) {
		String[] arr = input.split(" ");
		ArrayList<String> inputList = new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String> outputList = new ArrayList<String>();

		for (String getInput : inputList) {
			if (inputList.indexOf(getInput) != inputList.lastIndexOf(getInput)) {
				outputList.add(getInput);
				break;
			}
		}
		for (String getInput : inputList) {
			if (inputList.indexOf(getInput) == inputList.lastIndexOf(getInput)) {
				outputList.add(getInput);
				break;
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		ArrayList<String> outputList = new RepeatingNonRepeating().getRepeatingNonRepeating(str);
		System.out.println(outputList);
	}
}
