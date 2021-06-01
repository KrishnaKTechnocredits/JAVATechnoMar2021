package sai.Assignment25;
/*
 * Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25

 */

public class StringContainNumber {

	public static void main(String[] args) {
		StringContainNumber stringContainNumber = new StringContainNumber();
		String[] strarr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		System.out.println("String from given array which contains atleast one numbers are as below: ");
		for (int i = 0; i < strarr.length; i++) {
			String result = stringContainNumber.getnumString(strarr[i]);
			if (result != null)
				System.out.println(result);
		}
	}

	String getnumString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				return str;
			}
		}
		return null;
	}

}
