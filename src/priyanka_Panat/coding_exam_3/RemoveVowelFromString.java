/*
WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

input :  globant india test automation engineer

output :  glbnt nd tst tmtn ngnr
*/

package priyanka_Panat.coding_exam_3;

public class RemoveVowelFromString {

	boolean isVowel(char ch) {
		if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
				|| ch == 'u' || ch == 'U') {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		RemoveVowelFromString removeVowel = new RemoveVowelFromString();
		String str = "globAnt India tEst AUtomatiOn EngIneer";
		String findVowel = "";
		for (int index = 0; index < str.length(); index++) {
			boolean result = removeVowel.isVowel(str.charAt(index));
			if (!result) {
				char temp = str.charAt(index);
				findVowel += temp;
			}

		}
		System.out.println("After removing all the vowels from the given String , Updated string is  : " + findVowel);
	}
}
