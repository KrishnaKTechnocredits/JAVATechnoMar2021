package aashay.Test_3;
/*
 * WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

input : globant india test automation engineer

output : glbnt nd tst tmtn ngnr

Branch name :
Yourname_coding_exam_3

All the best !!!

Commit message :
Yourname_coding_exam_3_time
 */

public class RemoveVowelFromString {

	String removeVowel(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
					temp += Character.toString(ch);
				}
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveVowelFromString removeVowelFromString = new RemoveVowelFromString();
		String str = "globant india test automation engineer";
		String stringWithoutVowel = removeVowelFromString.removeVowel(str);
		System.out.println("Output: " + stringWithoutVowel);

	}

}
