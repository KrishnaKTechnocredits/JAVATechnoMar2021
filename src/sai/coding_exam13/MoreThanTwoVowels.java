package sai.coding_exam13;

import java.util.ArrayList;
import java.util.Arrays;

public class MoreThanTwoVowels {

	public ArrayList<String> getVowels(String[] words) {

		ArrayList<String> names = new ArrayList<String>(Arrays.asList(words));
		ArrayList<String> OutputNameList = new ArrayList<String>();
		for (int index = 0; index < names.size(); index++) {
			int count = 0;
			String name = names.get(index);
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
				char checkCh = name.charAt(innerIndex);
				if (checkCh == 'a' || checkCh == 'e' || checkCh == 'i' || checkCh == 'o' || checkCh == 'u')
					count++;
			}

			if (count > 2)
				OutputNameList.add(names.get(index));

		}
		return OutputNameList;
	}

	public static void main(String[] args) {
		String[] name = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		MoreThanTwoVowels moreThanTwoVowels = new MoreThanTwoVowels();
		ArrayList<String> output = moreThanTwoVowels.getVowels(name);
		System.out.println("Names containing more than two vowels are " + output);

	}

}
