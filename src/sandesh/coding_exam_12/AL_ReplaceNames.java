/*
2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
*/

package sandesh.coding_exam_12;

import java.util.ArrayList;
import java.util.Arrays;

public class AL_ReplaceNames {

	private int countName(ArrayList<String> inputArrayList, String targetInputName) {
		int countTargetName = 0;
		while (inputArrayList.contains(targetInputName)) {
			countTargetName++;
			inputArrayList.set(inputArrayList.indexOf(targetInputName), "Technocredits");
		}
		System.out.println(inputArrayList);
		return countTargetName;
	}

	public static void main(String[] args) {
		String targetName = "Aashay";
		String[] input = { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList(input));
		int countTarget = new AL_ReplaceNames().countName(stringList, targetName);
		System.out.print("Count of " + targetName + " in given list is -: ");
		System.out.print(countTarget);
	}
}
