package prachi.Assignment_23;

/*Assignment - 25 : 18th April'2021
 * Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */

public class ArrNumString1 {

	String getStringEementHavingDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				return str;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ArrNumString1 arrNumString1 = new ArrNumString1();
		String[] string_1 = { "TechnoCredits", "jo00jo00", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		System.out.println("String Elements having digits are: ");
		for (int i = 0; i < string_1.length; i++) {
			String returnArrString = arrNumString1.getStringEementHavingDigit(string_1[i]);
			if (returnArrString != null)
				System.out.println(returnArrString);
		}
	}
}

