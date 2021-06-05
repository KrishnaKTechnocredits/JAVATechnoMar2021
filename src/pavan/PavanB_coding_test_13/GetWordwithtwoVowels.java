package pavan.PavanB_coding_test_13;

import java.util.ArrayList;

public class GetWordwithtwoVowels {

	static ArrayList<String> GetWordwithtwoVowels(ArrayList<String> strarr) {
		ArrayList<String> output = new ArrayList<String>();
		for (int index = 0; index < strarr.size(); index++) {
			String targetname = strarr.get(index);
			boolean flag = isHavingtwoVowels(targetname);
			if (flag) {
			}
			output.add(strarr.get(index));
		}

		return output;
	}

	static private boolean isHavingtwoVowels(String targetname) {
		int count = 0;
		String lowercasetargetname = targetname.toLowerCase();

		for (int index = 0; index < targetname.length(); index++) {
			if (lowercasetargetname.charAt(index) == 'a' || lowercasetargetname.charAt(index) == 'e'
					|| lowercasetargetname.charAt(index) == 'i' || lowercasetargetname.charAt(index) == 'o'
					|| lowercasetargetname.charAt(index) == 'a') {
				count++;
			}

		}
		if (count > 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String[] strarr = { "Paavan", "Sandesh", "aashay", "Ankit" };
		ArrayList<String> list = new ArrayList<>();
		for (String text : strarr) {
			list.add(text);
		}
		GetWordwithtwoVowels get = new GetWordwithtwoVowels();
		ArrayList<String> output = get.GetWordwithtwoVowels(list);
		System.out.println(output);
	}
}
