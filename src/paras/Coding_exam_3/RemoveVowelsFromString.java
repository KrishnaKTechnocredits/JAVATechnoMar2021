/*
WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

input :  globant india test automation engineer

output :  glbnt nd tst tmtn ngnr
*/

package paras.Coding_exam_3;

public class RemoveVowelsFromString {
	
	String removeVowelsFromString(String str) {
		String temp = "";
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(!(ch=='A' ||ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o'|| ch=='U' || ch=='u')) 
				temp = temp + ch;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		RemoveVowelsFromString removeVowelsFromString = new RemoveVowelsFromString();
		String output = removeVowelsFromString.removeVowelsFromString("globant india test automation engineer");
		System.out.println("Output String by removing all the vowels from the given Input String is : " + output);
	}
}
