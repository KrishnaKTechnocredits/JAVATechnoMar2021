package meenu.assignment_26;

/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/

public class StringWithMaxDigits {

	String getStringWithMaxDigits(String[] numericStringArray) {
		String reqString = "";
		int maxDigits = 0;
		for (int index = 0; index < numericStringArray.length; index++) {
			int count = 0;
			for (int stringIndex = 0; stringIndex < numericStringArray[index].length(); stringIndex++) {
				if (Character.isDigit(numericStringArray[index].charAt(stringIndex)))
					count++;
			}
			if (maxDigits < count) {
				maxDigits = count;
				reqString = numericStringArray[index];
			}
		}
		return reqString;
	}

	public static void main(String[] args) {
		StringWithMaxDigits stringWithMaxDigits = new StringWithMaxDigits();
		String[] numericStringArray = { "P1u2r2va", "1K2omal", "4M4a5d5h1v1i93", "9S4hivan4i4", "1K2r3ati" };
		System.out.println(stringWithMaxDigits.getStringWithMaxDigits(numericStringArray));
	}
}
