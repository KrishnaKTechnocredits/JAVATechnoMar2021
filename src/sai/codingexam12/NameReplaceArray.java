package sai.codingexam12;

import java.util.ArrayList;

public class NameReplaceArray {

	static int count;

	int changeName(ArrayList<String> arr, String targetNum) {
		while (arr.contains(targetNum)) {
			arr.set(arr.indexOf(targetNum), "Technocredits");
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		NameReplaceArray nameReplaceArray = new NameReplaceArray();
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Vaibhav");
		arr.add("Aashay");
		arr.add("Prashant");
		arr.add("Aashay");
		arr.add("Aashay");
		arr.add("Anubhav");
		int count = nameReplaceArray.changeName(arr, "Aashay");
		System.out.println("output array is " + arr);
		System.out.println(count);
	}

}
