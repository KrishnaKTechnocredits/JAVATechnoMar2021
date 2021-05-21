/*
Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
 */

package sourabh.CodingExam_10;

public class FindfirstNonrepeatedCharacter {
	char getFindfirstNonrepeatedCharacter(String strInput) {
		char strOutput = ' ';
		for (int index = 0; index < strInput.length(); index++) {
			char checkCh = strInput.charAt(index);
			if (strInput.indexOf(checkCh) == strInput.lastIndexOf(checkCh)){
				strOutput = checkCh;
				break;
			}
		}
		return strOutput;
	}

	public static void main(String[] args) {
		FindfirstNonrepeatedCharacter findfirstNonrepeatedCharacter = new FindfirstNonrepeatedCharacter();
		char strOutput = findfirstNonrepeatedCharacter.getFindfirstNonrepeatedCharacter("abcgbca");
		System.out.println("output : "+strOutput);
	}
}
