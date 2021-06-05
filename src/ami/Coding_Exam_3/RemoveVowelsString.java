/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
input :  globant india test automation engineer
output :  glbnt nd tst tmtn ngnr*/

package ami.Coding_Exam_3;

public class RemoveVowelsString {

	String RemoveVowerch(String input1) {
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
		RemoveVowelsString removeVowelsString = new RemoveVowelsString();
		String str = "globant india test automation engineer";
		String output = removeVowelsString.RemoveVowerch(str);
		System.out.println("Outpur without Vowel :" + output);
	}

}
