package anubhav.switchexamples;

import java.util.Scanner;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 		input :  globant india test automation engineer
 		output :  glbnt nd tst tmtn ngnr
 */

public class RemoveVowels {

	String remVowels(String temp) {

		String output = "";

		for (int index = 0; index < temp.length(); index++) {
			char ch = temp.charAt(index);
			if (ch != 'A' && ch != 'a' && 
				ch != 'E' && ch != 'e' && 
				ch != 'I' && ch != 'i' && 
				ch != 'O' && ch != 'o' &&
				ch != 'U' && ch != 'u') {

				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		RemoveVowels removeVowels = new RemoveVowels();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string :");
		String temp= scanner.nextLine();
		System.out.println("Output string without vowels is : " + removeVowels.remVowels(temp));
		scanner.close();
	}
}
