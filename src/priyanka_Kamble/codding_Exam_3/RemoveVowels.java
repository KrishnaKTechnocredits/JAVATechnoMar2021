package priyanka_Kamble.codding_Exam_3;

/*
 * WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr
 */
public class RemoveVowels {
	String getString(String input) {
		String fialString = "";
		char ch;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')) {
				fialString += ch;
			}
		}
		return fialString;
	}

	public static void main(String[] args) {
		String input = "globant india test automation engineer";
		String str = new RemoveVowels().getString(input);
		System.out.println("Final Output String is => " + str);
	}
}
