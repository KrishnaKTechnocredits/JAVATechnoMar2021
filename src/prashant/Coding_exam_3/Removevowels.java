/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 input :  globant india test automation engineer
 output :  glbnt nd tst tmtn ngnr*/

package prashant.Coding_exam_3;

public class Removevowels {
	String removeVowels(String str) {
		String outstr = "";
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
			} else {
				outstr += ch;
			}
		}
		return outstr;
	}

	public static void main(String[] args) {
		Removevowels vowels = new Removevowels();
		String str = "globant india test automation engineer";
		String output = vowels.removeVowels(str);
		System.out.println(output);
	}
}
