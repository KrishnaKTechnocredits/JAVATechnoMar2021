/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
input :  globant india test automation engineer
output :  glbnt nd tst tmtn ngnr*/

package krati_Jain.codingExam3;

public class CodingExam3 {

	public static void main(String[] args) {
		CodingExam3 codingExam3 = new CodingExam3();
		System.out.println("Output: " + codingExam3.setString());
	}

	String setString() {
		String vowels = "";
		String consonants = "";
		String opString = "";
		String inputString = "globant india test automation engineer";
		for (int index = 0; index < inputString.length(); index++) {
			char tempChar = inputString.charAt(index); // globant
			if (tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u')
				vowels += tempChar;
			else
				consonants += tempChar;
		}
		return consonants;
	}
}
