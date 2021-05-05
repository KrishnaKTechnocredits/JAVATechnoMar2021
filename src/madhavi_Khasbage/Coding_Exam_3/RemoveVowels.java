package madhavi_Khasbage.Coding_Exam_3;
/* 
 WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.
 input :  globant india test automation engineer
 output :  glbnt nd tst tmtn ngnr*/

public class RemoveVowels {

	String removeVowelFromString(String strInput) {
		String strOutput = "";
		String strVowels = "a,e,i,o,u";
		strInput=strInput.toLowerCase();
		System.out.println("Input: " + strInput);
		for (int index = 0; index < strInput.length(); index++) {
			char ch = strInput.charAt(index);
			if (!strVowels.contains(String.valueOf(ch))) {
				strOutput += ch;
			}
		}
		return strOutput;
	}

	public static void main(String[] args) {
		RemoveVowels objRemove = new RemoveVowels();
		System.out.println("Output: " + objRemove.removeVowelFromString("globant AEIOU india test automatiAA TTTTon engineer"));
	}
}
