//input :  globant india test automation engineer
//output :  glbnt nd tst tmtn ngnr

package kajal.Codingexam;

public class ReturnString {

	String temp = "";
	String temp1 = "";
	char a;

	void removevowels(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if ((Character.isAlphabetic(ch)) || (Character.isSpaceChar(ch))) {

				if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
					temp += input.charAt(index);

				else {

					System.out.print(ch);

				}

			}
		}
	}

	public static void main(String[] args) {
		new ReturnString().removevowels("globant india test automation engineer");
	}
}
