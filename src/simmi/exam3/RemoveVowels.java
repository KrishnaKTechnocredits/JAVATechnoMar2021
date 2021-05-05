/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr*/

package simmi.exam3;

public class RemoveVowels {
	String vowels(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
			} else {
				temp = temp + str.charAt(index);
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		String input = "globant india test automation engineer";
		RemoveVowels removeVowels = new RemoveVowels();
		String msg = removeVowels.vowels(input);
		System.out.println("Output is: " + msg);
	}

}
