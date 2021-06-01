/*
WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

 input :  globant india test automation engineer

 output :  glbnt nd tst tmtn ngnr

Branch name :
Yourname_coding_exam_3
 */

package ankit.coding_exam_3;

public class RemoveVowelFromString {
	// Method One 
	String removeVowel(String str) {
		String outputString = "";
		for(int index = 0; index <str.length(); index++) {
			if(str.charAt(index) != 'a' && str.charAt(index) != 'e' && str.charAt(index) != 'i' && str.charAt(index) != 'o' && str.charAt(index) != 'u'&& str.charAt(index) != 'A' && str.charAt(index) != 'E' && str.charAt(index) != 'I' && str.charAt(index) != 'O' && str.charAt(index) != 'U' ) {
				outputString = outputString + str.charAt(index);	
			}
		}
		return outputString;
	} 

	//Method One end 

	//Method two using String function with regular expression 
	String removeVowel2(String str) {
		String OutputString ="";
		OutputString = OutputString + str.replaceAll("[aeiouAEIOU]", ""); // [aeiouAEIOU is a regular expression which will compare each character
		return OutputString;
	}
	//Method Two end

	public static void main(String[] args) {
		RemoveVowelFromString removeVowelFromString = new RemoveVowelFromString();
		String input = "GlobAnt iNdia test auTomatIon engineer"; 
		String inputInLowerCase = input.toLowerCase();
		String output1 = removeVowelFromString.removeVowel(input);
		String output2 = removeVowelFromString.removeVowel2(input);
		System.out.println("Input String :" +input);
		System.out.println("Output with method 1 :"+output1);
		System.out.println("Output with method 2 :"+output2);
	}
}


