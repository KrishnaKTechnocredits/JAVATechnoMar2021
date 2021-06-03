package kangan.Coding.Exam12;

import java.util.ArrayList;
/*2) int countName(ArrayList<String> arr, String targetName) []

input : ["Vaibhav", "Aashay", "Prashant", "Aashay", "Aashay", "Anubhav"]
target name : Aashay and replace the target name with Technocredits
Replace targetName with Technocredits
output : ["Vaibhav", "Technocredits", "Prashant", "Technocredits", "Technocredits", "Anubhav"] 
output : 3*/

public class ArrayList2 {

	int countName(ArrayList<String> arr, String targetName) {
		ArrayList<String> output = new ArrayList<String>();
		int count = 0;
		while (arr.contains(targetName)) {
			arr.remove(targetName);
			count += 1;
		}
		return count;
	}

	ArrayList<String> getUpdatedList(ArrayList<String> arr, String targetName) {
		while (arr.contains(targetName)) {
			int index = arr.indexOf(targetName);
			arr.set(index, "Technocredits");
		}

		return arr;
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vaibhav");
		names.add("Aashay");
		names.add("Prashant");
		names.add("Aashay");
		names.add("Aashay");
		names.add("Anubhav");
		ArrayList2 arrayList2 = new ArrayList2();
		ArrayList<String> updatedNames = arrayList2.getUpdatedList(names, "Aashay");
		System.out.println(updatedNames);
		int count = arrayList2.countName(names, "Technocredits");
		System.out.println(count);
	}
}
