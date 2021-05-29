/*Programming Test - 12 : 22nd May'2021

 2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3
 */
package ravindra_J.coding_exam_12_Coll_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ReplaceTargetWithAnotherName {
	int count;

	public void replace(ArrayList<String> input, String str) {

		while (input.contains(str)) {
			count++;
			int index = input.indexOf(str);
			input.set(index, "Technocredit");
		}
		System.out.println("Output: " + input);
		System.out.println("Count of replaced object from an list : " + count);
	}

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("Vaibhav");
		input.add("Aashay");
		input.add("Prashant");
		input.add("Aashay");
		input.add("Aashay");
		input.add("sushma");
		System.out.println("Input : " + input);
		ReplaceTargetWithAnotherName replacetarget = new ReplaceTargetWithAnotherName();
		replacetarget.replace(input, "Aashay");
	}
}
