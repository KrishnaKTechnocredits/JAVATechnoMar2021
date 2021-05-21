package komal.coding_exam_3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr
*/
public class RemovingAllTheVowels {
	String removeVowel(String str1) {
		String str2 = str1.replaceAll("[aeiouAEIOU]", "");
		return str2;
	}

	public static void main(String[] args) {
		RemovingAllTheVowels removingAllTheVowels = new RemovingAllTheVowels();
		String str = "globant india test automation engineer";
		String str3 = removingAllTheVowels.removeVowel(str);
		System.out.println("String without vowels is:-\n" + str3);
	}
}