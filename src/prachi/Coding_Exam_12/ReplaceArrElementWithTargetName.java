package prachi.Coding_Exam_12;

import java.util.ArrayList;

/*int countName(ArrayList<String> arr, String targetName) []
input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3
Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set*/

public class ReplaceArrElementWithTargetName {
	
	static String target = "Aashay";
	static int count = 0;
	
	int countName(ArrayList<String> arr, String targetName) {

		while(arr.contains(targetName)) {
			arr.set(arr.indexOf(targetName), "Technocredits");
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		ReplaceArrElementWithTargetName replace = new ReplaceArrElementWithTargetName();
		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add("Vaibhav");
		arrStr.add("Aashay");
		arrStr.add("Prashant");
		arrStr.add("Aashay");
		arrStr.add("Aashay");
		arrStr.add("Anubhav");
		
		System.out.println("Aashay name count is : " + replace.countName(arrStr, "Aashay"));
		System.out.println(arrStr);
	}
}
