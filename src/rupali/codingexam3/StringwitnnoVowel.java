/*
 * WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr

 */
package rupali.codingexam3;

public class StringwitnnoVowel {
	String processString(String str) {
		String temp="";
		char ch;
		for(int index=0;index<str.length();index++) {
			ch=str.charAt(index);
			if(!(ch=='A' ||ch=='a'|| ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o'|| ch=='U' || ch=='u'))
				temp=temp+ch;
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		StringwitnnoVowel stringwitnnoVowel= new StringwitnnoVowel();
		String input="globant india test automation engineer";
		System.out.println("Input: "+input);
		String output=stringwitnnoVowel.processString(input);
		System.out.println("Output: "+output);
	}

}
