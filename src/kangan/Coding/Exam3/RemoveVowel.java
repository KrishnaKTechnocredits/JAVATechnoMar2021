package kangan.Coding.Exam3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
input :  globant india test automation engineer
output :  glbnt nd tst tmtn ngnr*/

public class RemoveVowel {

	String removeVowel(String input) {
		String output =  "";
		for(int index=0;index<input.length();index++) {
			char ch= input.charAt(index);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U') {
		output = output+input.charAt(index);
			}
		}
		return output;
	}
	public static void main(String[] args) {
		RemoveVowel removeVowel = new RemoveVowel();
		String output= removeVowel.removeVowel("globant india test automation engineer");
		System.out.println(output);
	}
}
