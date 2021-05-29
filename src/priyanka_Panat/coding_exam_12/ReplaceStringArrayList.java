/*
* Programming Test - 12 : 22nd May'2021

2) input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3
*/
package priyanka_Panat.coding_exam_12;

import java.util.ArrayList;

public class ReplaceStringArrayList {
	int printReplaceString(ArrayList<String> arr, String targetName) {
		int count = 0;
		while (arr.contains(targetName)) {
			arr.set(arr.indexOf(targetName), "Technocredits");
			count++;
		}
		System.out.println("ArrayList after replacing " + targetName + " with Technocredits is : ");
		System.out.println(arr);
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
		System.out.println("Before ArrayList : " + names);
		int output = new ReplaceStringArrayList().printReplaceString(names, "Aashay");
		System.out.println("Count of name Aashay in an ArrayList is : " + output);
	}

}
