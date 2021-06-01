/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr*/

package rahul_Hiremath.exam_3;

public class Exam_3_1 {

	String removeVowels(String str) {
		String expected = "";
		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			if (current != 'a' && current != 'e' && current != 'i' && current != 'o' && current != 'u') {
				expected = expected + current;
			}
		}
		return expected;
	}

	public static void main(String[] args) {

		Exam_3_1 exam_3_1 = new Exam_3_1();
		String str = "globant india test automation engineer";
		String expected = exam_3_1.removeVowels(str);
		System.out.println("Expected string is: " + expected);
	}
}
