/*input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3
*/
package simmi.exam12;

import java.util.ArrayList;

public class ReplaceTargetName {
	static int count = 0;

	ArrayList<String> replaceName(ArrayList<String> input, String target) {

		for (int index = 0; index < input.size(); index++) {
			if (input.contains(target)) {
				input.set(input.indexOf(target), "Technocredits");
				count++;
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Vaibhav");
		name.add("Aashay");
		name.add("Prashant");
		name.add("Aashay");
		name.add("Aashay");
		name.add("Anubhav");

		ReplaceTargetName replaceTargetName = new ReplaceTargetName();
		ArrayList<String> output = replaceTargetName.replaceName(name, "Aashay");
		System.out.println(output);
		System.out.println(count);
	}
}
