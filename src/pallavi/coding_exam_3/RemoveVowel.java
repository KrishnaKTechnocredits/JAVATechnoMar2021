package pallavi.coding_exam_3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

		 input :  globant india test automation engineer

		 output :  glbnt nd tst tmtn ngnr*/

public class RemoveVowel {
	String sentence = "";

	public String removeVowel(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == 'a' || str.charAt(index) == 'e' || str.charAt(index) == 'i'
					|| str.charAt(index) == 'o' || str.charAt(index) == 'u') {
			}

			else {
				sentence = sentence + str.charAt(index);
			}
		}

		return sentence;

	}

	public static void main(String[] args) {
		String msz = "globant india test automation engineer";
		String newString = new RemoveVowel().removeVowel(msz);
		System.out.println(newString);

	}

}
