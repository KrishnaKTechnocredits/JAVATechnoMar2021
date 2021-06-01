package krishna_CodingTest_3;
/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 input :  globant india test automation engineer
 output :  glbnt nd tst tmtn ngnr
*/
public class RemovingVowel {
	String checkVowel(String sentance) {
		String output = "";
		for (int index = 0; index < sentance.length(); index++) {
			char ch = sentance.charAt(index);
			char lowerch = Character.toLowerCase(ch);

			if (lowerch != 'a' && lowerch != 'e' && lowerch != 'i' && lowerch != 'o' && lowerch != 'u') {
				output = output + ch;
			}
		}

		return output;
	}

	public static void main(String[] args) {
		RemovingVowel removingVowel = new RemovingVowel();
		String sentance = "Globant india test automation engineer";
		String withoutVowel = removingVowel.checkVowel(sentance);
		System.out.println(withoutVowel);
	}

}
