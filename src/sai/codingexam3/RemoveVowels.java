package sai.codingexam3;

public class RemoveVowels {

	String RemoveVowel(String input1) {
		String vowel = "";
		String collect = "";
		String output = "";

		for (int index = 0; index < input1.length(); index++) {
			String input = input1.toLowerCase();
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel = vowel + ch;
			} else {
				collect = collect + ch;
			}

		}
		return collect;
	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		String str = "globant india test automation engineer";
		String output = removeVowels.RemoveVowel(str);
		System.out.println("String without vowel is :" + output);
	}

}