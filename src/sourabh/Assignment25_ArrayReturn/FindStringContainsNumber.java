/*Assignment - 25 : 18th April'2021
 * Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/

package sourabh.Assignment25_ArrayReturn;

public class FindStringContainsNumber {
	String[] getStringContainsNumber(String[] str) {
		String[] strOutput = new String[5];
		int stringIndex = 0;		
		for (int index = 0; index < str.length; index++) {
			boolean isDigitFlag = false;
			for (int index1 = 0; index1 < str[index].length(); index1++) {
				char ch = str[index].charAt(index1);
				if (Character.isDigit(ch)) {
					isDigitFlag = true;
					break;
				}
			}
			if (isDigitFlag)
				strOutput[stringIndex] = str[index];
				stringIndex++;
		}
		return strOutput;
	}

	public static void main(String[] args) {
		FindStringContainsNumber findStringContainsNumber = new FindStringContainsNumber();
		String[] strInput = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] strOutput = findStringContainsNumber.getStringContainsNumber(strInput);
		for (int index = 0; index < strOutput.length; index++) {
			if (strOutput[index] != null)
				System.out.println(strOutput[index]);
		}
	}
}
