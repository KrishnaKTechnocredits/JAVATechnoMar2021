/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr
 */

//coding_exam_3

package sourabh.CodingExam_3;

public class RemovingVowelsFromString {
/*	boolean isVowel(char ch) {
		String strVowel="aeiouAEIOU";
		for(int index=0; index<strVowel.length();index++) {
			char checkVowel= strVowel.charAt(index);
			if(checkVowel==ch)
				return true;
		}
		return false;
	}
*/	
	boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'|| ch=='I' || ch=='O' || ch=='U')
			return true;
		return false;
		
	}
	
	
	String removingAllVowels(String strInput) {
		String strFinal="";
		for(int index=0; index<strInput.length();index++) {
			char checkVowel= strInput.charAt(index);
			if(!isVowel(checkVowel))
				strFinal= strFinal+	checkVowel;
		}
		return strFinal;
	}
	public static void main(String[] args) {
		RemovingVowelsFromString removingVowelsFromString=new RemovingVowelsFromString();
		String strOutput= removingVowelsFromString.removingAllVowels("globant india test automation engineer");
		System.out.println(strOutput);
	}

}
