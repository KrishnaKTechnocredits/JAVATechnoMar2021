package shivani.Coding_Exam_3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

		 input :  globant india test automation engineer

		 output :  glbnt nd tst tmtn ngnr*/
public class VowelRemoveString {
	String temp = "";

	void vowelString(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

			} else {
				ch = str.charAt(i);
				temp += Character.toString(ch);

			}

		}
		System.out.println(temp);

	}

	public static void main(String[] args) {

		VowelRemoveString vowelRemoveString = new VowelRemoveString();

		vowelRemoveString.vowelString("globant india test automation engineer");
	}

}
