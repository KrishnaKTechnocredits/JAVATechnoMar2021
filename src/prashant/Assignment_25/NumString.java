/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/
package prashant.Assignment_25;

public class NumString {
	String getnumString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				return str;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		NumString numstr = new NumString();
		String[] strarr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		System.out.println("String from given array which contains atleast one numbe arer");
		for (int i = 0; i < strarr.length; i++) {
			String result = numstr.getnumString(strarr[i]);
			if (result != null)
				System.out.println(result);
		}
	}
}