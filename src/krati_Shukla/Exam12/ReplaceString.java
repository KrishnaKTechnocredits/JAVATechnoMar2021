/*target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits*/

package krati_Shukla.Exam12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceString {

	int ReplaceName(String[] input) {

		List<String> list = Arrays.asList(input);
		ArrayList<String> output = new ArrayList<String>(list);
		int count = 0;

		while (output.contains("Aashay")) {
			int index = output.indexOf("Aashay");
			output.set(index, "Technocredits");
			count++;
		}

		System.out.println(output);
		return count;
	}

	public static void main(String[] args) {
		ReplaceString replaceString = new ReplaceString();
		String[] str = { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		int answer = replaceString.ReplaceName(str);
		System.out.println(answer);
	}

}
