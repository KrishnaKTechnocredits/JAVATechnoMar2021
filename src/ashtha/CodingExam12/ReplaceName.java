package ashtha.CodingExam12;

import java.util.ArrayList;

public class ReplaceName {

	int countName(ArrayList<String> arr, String targetName) {
		int count = 0;
		while (arr.contains(targetName)) {
			int index = arr.indexOf(targetName);
			arr.set(index, "Technocredits");
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		ReplaceName replaceName = new ReplaceName();
		ArrayList<String> input = new ArrayList<String>();
		input.add("Vaibhav");
		input.add("Aashay");
		input.add("Prashant");
		input.add("Aashay");
		input.add("Aashay");
		input.add("Anubhav");
		String target = "Aashay";
		System.out.println("Input : " + input);
		int answer = replaceName.countName(input, target);
		System.out.println("The count of target name ("+target+") in the arraylist : " + answer);
		System.out.println("Output : " + input);
	}
}
