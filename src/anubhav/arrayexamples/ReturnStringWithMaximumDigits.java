package anubhav.arrayexamples;

/*Program 1: Write a method which will return a string containing maximum digits.
	Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
	Output : 4M4a5d5h1v1i93; */

public class ReturnStringWithMaximumDigits {

	String returnMaxDigit(String[] temp) {
		int max = 0;
		int arrayLength = temp.length;
		String maxDigits = "";

		for (int index = 0; index < arrayLength; index++) {

			String string = temp[index];
			int stringLength = string.length();
			int numberOfDigits = 0;

			for (int innerIndex = 0; innerIndex < stringLength; innerIndex++) {

				char a = string.charAt(innerIndex);
				if (Character.isDigit(a)) {
					numberOfDigits++;
				}
			}
			//System.out.println(numberOfDigits);
			if (max < numberOfDigits)
				max = numberOfDigits;
				maxDigits= temp[index];
		}
		return maxDigits;
	}

	public static void main(String[] args) {
		ReturnStringWithMaximumDigits returnStringWithMaximumDigits = new ReturnStringWithMaximumDigits();
		String[] temp = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String output= returnStringWithMaximumDigits.returnMaxDigit(temp);
		System.out.println(output);
	}
}
