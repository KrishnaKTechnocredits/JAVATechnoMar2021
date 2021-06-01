package sai.codingExam3;

public class NoVowels {

	public static void main(String[] args) {
		NoVowels noVowels = new NoVowels();
		System.out.println(noVowels.withoutVowels("globant india test automation engineer"));

	}

	String withoutVowels(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (!Character.isDigit(ch)) {
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I'
						&& ch != 'O' && ch != 'U') {
					temp += Character.toString(ch);
				}
			}
		}
		return temp;
	}

}
