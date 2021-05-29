package monali.coding_exam_12;

import java.util.ArrayList;

public class NameCount {

	static int countName(ArrayList<String> arrList, String targetName) {
		int count = 0;
		int index = 0;
		ArrayList<String> output = new ArrayList<String>();
		while (arrList.contains(targetName)) {
			index = arrList.indexOf(targetName);
			arrList.set(index, "technocredits");
			count++;
		}
		System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ashay");
		names.add("surbhi");
		names.add("Ashay");
		names.add("saurav");
		names.add("monali");
		names.add("Ashay");

		int answer = countName(names, "Ashay");
		System.out.println(names);

	}
}
