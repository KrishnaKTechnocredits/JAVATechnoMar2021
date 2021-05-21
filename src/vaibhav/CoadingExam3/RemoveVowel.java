/*Coding Exam - 2: 26th April 2021

WAP to return a string by removing all the vowels from the given String.
Output should be printed in main method.

Input: globant india test automation engineer

Output: glbnt nd tst tmtn ngnr

*/

package vaibhav.CoadingExam3;

public class RemoveVowel {

	String processString(String str) {
		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			switch (ch) {
			case 'a':
				break;
			case 'e':
				break;
			case 'i':
				break;
			case 'o':
				break;
			case 'u':
				break;
			default:
				temp += ch;
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		RemoveVowel removeVowel = new RemoveVowel();

		String input = "globant india test automation engineer";
		String output;
		
		output = removeVowel.processString(input);
		System.out.println(output);
	}
}
