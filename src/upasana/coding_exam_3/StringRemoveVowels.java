/*
 WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr
 */

package upasana.coding_exam_3;

public class StringRemoveVowels {

	String removeVowels(String str) {

		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			} else
				output = output + str.charAt(index);
		}

		return output;
	}

	public static void main(String[] args) {

		String str = "globant india test automation engineer";
		String output = new StringRemoveVowels().removeVowels(str);
		System.out.println(output);
	}
}
