/*int countName(ArrayList<String> arr, String targetName) []
input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3  
*/
package kajal.Codingexam;

import java.util.ArrayList;

public class ReplaceElementArraylistandCount {
	int cnt = 0;

	ArrayList<String> replaceandCnt(ArrayList<String> input) {

		int index = 0;
		while (index < input.size()) {
			if (input.contains("Vicky")) {
				index = input.indexOf("Vicky");
				input.set(index, "Technocredits");
			}
			index++;
			cnt++;

		}
		System.out.println(cnt);
		return input;
	}

	public static void main(String[] args) {
		ReplaceElementArraylistandCount replace = new ReplaceElementArraylistandCount();
		ArrayList<String> input = new ArrayList<String>();
		input.add("Vaibhav");
		input.add("Vicky");
		input.add("Prashant");
		input.add("Vicky");
		input.add("Vicky");
		input.add("Anubhav");

		ArrayList<String> ans = replace.replaceandCnt(input);
		System.out.println(ans);

	}

}