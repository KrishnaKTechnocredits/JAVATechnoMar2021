package shashank.coding_exam12;

import java.util.ArrayList;
import java.util.Arrays;

/*2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"]
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
}*/
public class ReplaceName {
	int countName(ArrayList<String> list, String targetName) {
		int count = 0;
		while (list.indexOf(targetName) != -1) {
			count++;
			list.set(list.indexOf(targetName), "Technocredits");
		}

		System.out.println(list);
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceName replaceName = new ReplaceName();
		String arr[] = { "Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav" };
		String str = "Aashay";
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));
		int count = replaceName.countName(list, str);
		System.out.println("Count of targate Name is " + count);
	}

}
