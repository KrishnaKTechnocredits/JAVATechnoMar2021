/*
 2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
output : 3

target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 


Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
*/

package ami.Coding_Exam_12;

import java.util.ArrayList;

public class GetCountCollection {

	int GetSameNameCount(ArrayList<String> arr, String targetName) {
		int count = 0;
		while (arr.contains(targetName)) {
			arr.set(arr.indexOf(targetName), "Technocredits");
			count++;
		}
		return count;
	}

	public static void main(String[] a) {
		ArrayList<String> input = new ArrayList<>();
		input.add("Vaibhav");
		input.add("Aashay");
		input.add("Prashant");
		input.add("Aashay");
		input.add("Aashay");
		input.add("Anubhav");

		GetCountCollection getCountCollection = new GetCountCollection();
		int getCont = getCountCollection.GetSameNameCount(input, "Aashay");
		System.err.println("New Array :" + input);
		System.out.println("Count of Repeat name : " + getCont);
	}
}
