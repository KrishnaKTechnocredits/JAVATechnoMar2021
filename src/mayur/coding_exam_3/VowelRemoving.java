package mayur.coding_exam_3;

public class VowelRemoving {
	String vowelString(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'o':
				break;
			case 'u':
				break;
			default:
				temp = temp + ch;
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		VowelRemoving vowel = new VowelRemoving();

		String input = "globant india test automation engineer";
		String output;

		output = vowel.vowelString(input);
		System.out.println(output);
	}
}
