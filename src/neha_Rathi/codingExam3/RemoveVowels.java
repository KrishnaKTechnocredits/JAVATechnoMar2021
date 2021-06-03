//WAP to return a string by removing all the vowels from the given String. 
//  Output should be printed in main method.
//input :  globant india test automation engineer
//output :  glbnt nd tst tmtn ngnr

package neha_Rathi.codingExam3;

public class RemoveVowels {
	
	static String removeVowels(String input) {
		String output="";
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)!='a'&& input.charAt(index)!='e'&&input.charAt(index)!='i'&&input.charAt(index)!='o'&&input.charAt(index)!='u') 
				output+=input.charAt(index);
		}
		return output;
	}

	public static void main(String[] args) {
		String input="globant india test automation engineer";
		System.out.println(removeVowels(input));
	}
}
