//WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

package krati_Shukla.Exam3;

public class Vowels {
	
	String FindVowels(String input) {
		
		String output= "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			ch = Character.toUpperCase(ch);
					if (ch !='A' && ch !='E' && ch !='I' && ch !='O' && ch !='U' ) {
						output = output+ch;
					}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		String str = "globant india test automation engineer";
		String output = vowels.FindVowels(str);
		System.out.println(output);
	}
}
