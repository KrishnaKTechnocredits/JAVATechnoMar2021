/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 input :  globant india test automation engineer
 output :  glbnt nd tst tmtn ngnr*/
package pravin.Coding_exam3;
public class RemoveVowels {
	String removals(String string) {
		String temp = "";
		for (int index = 0; index < string.length(); index++) {
			char ch = string.charAt(index);
			if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'
				|| ch == 'O'||ch == 'U') {
			} else {
				temp = temp + string.charAt(index);
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		String str = "globant india test automation engineer";
		String var = new RemoveVowels().removals(str);
		System.out.println("Output is :" + var);
	}
}