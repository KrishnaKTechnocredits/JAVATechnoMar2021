package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.Arrays;

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