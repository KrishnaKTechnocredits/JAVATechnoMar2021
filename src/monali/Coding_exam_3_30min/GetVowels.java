package monali.Coding_exam_3_30min;

public class GetVowels {

	String removeVowels(String input) {
		String str = "";
		int num = 1;
		char c;
		for (int index = 0; index < input.length(); index++) {
			c = input.charAt(index);
			if (c == 'a' || c == 'e' || c == 'i' | c == 'o' | c == 'u')
				num = 0;
			else {
				str = str + c;
			}
		}
		System.out.println(str);
		return str;
	}

	public static void main(String[] args) {
		String str = "globant india test automation engineer";
		GetVowels vowels = new GetVowels();
		vowels.removeVowels(str);
	}
}
