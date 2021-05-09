/*WAP to return a string by removing all the vowels from the given String. Output should be printed in 
 main method.
 input :  globant india test automation engineer
 output :  glbnt nd tst tmtn ngnr
*/
package shilpa.Coding_Exam_3;

public class RemoveVowelsFrmStr {
	boolean isVowel(char ch) {
		if (ch == 'a' || ch=='A'||ch == 'e' ||ch=='E'|| ch == 'i'||ch=='I' || ch == 'o'||ch=='O' || ch == 'u'||ch=='U') {
			return true;
		} else
			return false;
	}

	String getStringWithoutVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++)
			if (isVowel(input.charAt(index)) != true) {
				output += input.charAt(index);
			}
		return output;
	}

	public static void main(String[] args) {
		RemoveVowelsFrmStr removeVowelsFrmStr = new RemoveVowelsFrmStr();
		String output = removeVowelsFrmStr.getStringWithoutVowels("globant indiAa test automation engineer");
		System.out.println("input = globant indiAa test automation engineer"+"\nOutput= " + output);
	}

}
