package mayur.coding_exam_13;

import java.util.ArrayList;

public class Vowels {
	ArrayList<String> getVowels(ArrayList<String> str) {
		ArrayList<String> str1 = new ArrayList<String>();
		for (int index = 0; index < str.size(); index++) {
			String name = str.get(index);
			int count = 0;
			for (int i = 0; i < name.length(); i++) {
				char ch = name.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			if (count > 2)
				str1.add(str.get(index));
		}
		return str1;
	}

	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		ArrayList<String> str = new ArrayList<String>();
		str.add("aashay");
		str.add("sandesh");
		str.add("madhavi");
		str.add("ankit");
		str.add("ami");
		str.add("priyanka");
		ArrayList<String> output = vowels.getVowels(str);
		System.out.println("words having more than two vowels are " + output);
	}

}
