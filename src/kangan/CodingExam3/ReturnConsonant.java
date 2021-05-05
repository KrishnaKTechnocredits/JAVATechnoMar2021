package kangan.CodingExam3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
		 input :  globant india test automation engineer
		 output :  glbnt nd tst tmtn ngnr*/

public class ReturnConsonant {

	String getConsonant(String input) {
		String input1 = "";
		for (int index = 0; index < input.length(); index++) {
			input1 = input.replaceAll("[aeiouAEIOU]", "");
		}

		return input1;
	}

	public static void main(String[] args) {
		ReturnConsonant returnConsonant = new ReturnConsonant();
		String output = returnConsonant.getConsonant("globant india test automation engineer");
		System.out.println(output);

	}
}
