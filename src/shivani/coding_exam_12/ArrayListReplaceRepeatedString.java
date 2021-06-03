package shivani.coding_exam_12;

import java.util.ArrayList;

/*input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3
*/
public class ArrayListReplaceRepeatedString {
	int count;

	int inputName(ArrayList<String> input, String tarName) {

		while (input.contains(tarName)) {

			count++;

			input.set(input.indexOf(tarName), "Technocredits");

		}
		return count;

	}

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("Vaibhav");
		input.add("Aashay");
		input.add("Prashant");
		input.add("Aashay");
		input.add("Aashay");
		input.add("Anubhav");

		ArrayListReplaceRepeatedString arrayListReplaceRepeatedString = new ArrayListReplaceRepeatedString();
		int output = arrayListReplaceRepeatedString.inputName(input, "Aashay");
		System.out.println(output);
		System.out.println(input);
	}

}
