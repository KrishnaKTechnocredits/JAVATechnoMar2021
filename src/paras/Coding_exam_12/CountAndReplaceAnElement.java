/*
Programming Test - 12 : 22nd May'2021
2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
 */
package paras.Coding_exam_12;

import java.lang.reflect.Array;
import java.util.ArrayList;

import ashish_Vyas.Assignment_21.Count;

public class CountAndReplaceAnElement {

	int countAndReplaceAnElement(ArrayList<String> name, String targetNum, String updateNum) {
		int count = 0;
		while (name.contains(targetNum)) {
			name.set(name.indexOf(targetNum), updateNum);
			count++;
		}
		System.out.println(name);
	//	System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Vaibhav");
		arr.add("Aashay");
		arr.add("Prashant");
		arr.add("Aashay");
		arr.add("Aashay");
		arr.add("Anubhav");
		CountAndReplaceAnElement countAndReplaceAnElement = new CountAndReplaceAnElement();
		System.out.println(countAndReplaceAnElement.countAndReplaceAnElement(arr, "Aashay", "Technocredits"));

	}
}
