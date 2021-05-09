/*
WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
input :  globant india test automation engineer
output :  glbnt nd tst tmtn ngnr
*/

package kajal.Codingexam;

public class ReturnString {

	boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		ReturnString returnstring = new ReturnString();
		String str = "globAnt India tEst AUtomatiOn EngIneer";
		String findVowel = "";
		for (int index = 0; index < str.length(); index++) {
			boolean result = returnstring.isVowel(str.charAt(index));
			if (!result) {
				char temp = str.charAt(index);
				findVowel += temp;
			}

		}
		System.out.println(findVowel);
	}
}