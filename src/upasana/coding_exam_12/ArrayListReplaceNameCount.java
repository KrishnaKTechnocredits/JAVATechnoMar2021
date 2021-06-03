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
package upasana.coding_exam_12;

import java.util.ArrayList;

public class ArrayListReplaceNameCount {

	int countName(ArrayList<String> arr, String targetName) {
		
		int count = 0;
		int index = 0;
		while (arr.contains(targetName)) {
			if (index == arr.indexOf(targetName)) {
				count++;
				arr.set(index, "Technocredits");
			}
			index++;
		}
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();

		nameList.add("Vaibhav");
		nameList.add("Aashay");
		nameList.add("Prashant");
		nameList.add("Aashay");
		nameList.add("Aashay");
		nameList.add("Anubhav");

		String targetName = "Aashay";

		ArrayListReplaceNameCount arrList = new ArrayListReplaceNameCount();
		int count = arrList.countName(nameList, targetName);
		System.out.println(count);
		System.out.println(nameList);

	}

}
