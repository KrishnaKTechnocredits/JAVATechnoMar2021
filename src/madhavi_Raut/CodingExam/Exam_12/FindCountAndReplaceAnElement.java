package madhavi_Raut.CodingExam.Exam_12;

import java.util.ArrayList;

/*2) int countName(ArrayList<String> arr, String targetName) []
input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3*/

public class FindCountAndReplaceAnElement {

	int getCountAndReplaceAnElement(ArrayList<String> names, String targetName, String newName) {
		int count = 0;
		while (names.contains(targetName)) {
			names.set(names.indexOf(targetName), newName);
			count++;
		}
		System.out.println("New ArrayList: " + names);
		System.out.print("Number of occurence of " + targetName + " :");
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vaibhav");
		names.add("Aashay");
		names.add("Prashant");
		names.add("Aashay");
		names.add("Aashay");
		names.add("Anubhav");

		System.out.println(
				new FindCountAndReplaceAnElement().getCountAndReplaceAnElement(names, "Aashay", "Technocredits"));
	}
}
