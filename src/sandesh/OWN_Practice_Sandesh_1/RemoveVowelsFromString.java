/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr*/

package sandesh.OWN_Practice_Sandesh_1;

import java.util.Scanner;

public class RemoveVowelsFromString {

	String getProcessedString(String inputString) {
		String processedStrOutput = inputString.replaceAll("[aeiouAEIOU]", "");
		return processedStrOutput;
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String from which you want to remove Vowels.");
		String strInput = sc1.nextLine();
		String processedString = new RemoveVowelsFromString().getProcessedString(strInput);
		System.out.println("Input String is -: " + strInput);
		System.out.println("Output String is -: " + processedString);
		sc1.close();
	}
}
