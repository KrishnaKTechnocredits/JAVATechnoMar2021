package madhavi_Raut.CodingExam.Exam_03;
/*WAP to return a string by removing all the vowels from the given String. 
  Output should be printed in main method.
input :  globant india test automation engineer
output :  glbnt nd tst tmtn ngnr*/

public class ReturnStringWithoutVowel {

	String getStringWithoutVowel(String str) {
		String newString = ""; 
		for (int index = 0; index < str.length(); index++) {
			String strChar = String.valueOf(str.charAt(index));
			if (!(strChar.equalsIgnoreCase("a") || strChar.equalsIgnoreCase("e") || strChar.equalsIgnoreCase("i")
					|| strChar.equalsIgnoreCase("o") || strChar.equalsIgnoreCase("u"))) {
				newString += strChar;
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println("Below is the string without vowel:");
		System.out.println(
				new ReturnStringWithoutVowel().getStringWithoutVowel("globant india test automation engineer"));
	}
}
