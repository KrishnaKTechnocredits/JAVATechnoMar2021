/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 input :  globant india test automation engineer
 output :  glbnt nd tst tmtn ngnr
Branch name :
Yourname_coding_exam_3
 */
package ravindra_J.coding_exam_3;

public class StringWithoutVowels {
	static String out = "";

	public static void main(String[] args) {

		String input = "globant india test automation engineer";
		String output = getInputString(input);
		System.out.println(output);
	}

	static String getInputString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = Character.toLowerCase(str.charAt(index));
			out = getVowelsFreeString(ch);
		}
		return out;
	}

	static String getVowelsFreeString(char ch1) {
		if (ch1 == 'a')
			System.out.print("");
		else if (ch1 == 'e')
			System.out.print("");
		else if (ch1 == 'i')
			System.out.print("");
		else if (ch1 == 'o')
			System.out.print("");
		else if (ch1 == 'u')
			System.out.print("");
		else
			out = out + ch1;
		return out;
	}
}
