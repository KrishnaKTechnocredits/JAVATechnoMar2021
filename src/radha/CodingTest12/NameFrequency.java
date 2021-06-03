/*
2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"]
output : 3

Hint : Loop should be travesered only 3 times or occurance of target name.
Hint : contains, indexOf, set
 */
package radha.CodingTest12;

import java.util.ArrayList;

public class NameFrequency {
	int countName(ArrayList<String> arr, String targetName) {
		int count=0;
		while(arr.contains(targetName)) {
			count++;
			arr.set(arr.indexOf(targetName), "Technocredits");
		}
		System.out.println("Array after replacement is: "+arr);
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
		NameFrequency freq = new NameFrequency();
		System.out.println("Input Array "+names);
		int nameCount= freq.countName(names, "Aashay");
		System.out.println();
		System.out.println("Target Name count is : "+nameCount);
	}
}