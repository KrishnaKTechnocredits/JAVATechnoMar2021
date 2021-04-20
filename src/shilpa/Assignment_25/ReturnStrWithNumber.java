/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/
package shilpa.Assignment_25;

public class ReturnStrWithNumber {

	String[] getStringWithNumber(String[] str) {
		String[] str1 = new String[str.length];
		for (int index = 0; index < str.length; index++) {
			for (int index1 = 0; index1 < str[index].length(); index1++) {
				char ch = str[index].charAt(index1);
				if (Character.isDigit(ch))
					str1[index] = str[index];
			}
		}
		return str1;
	}

	public static void main(String[] args) {
		ReturnStrWithNumber returnStrWithNumber = new ReturnStrWithNumber();
		String[] str2 = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] str3 = new String[str2.length];
		str3 = returnStrWithNumber.getStringWithNumber(str2);
		System.out.println("Strings which Contain Numbers from given array are");
		for (int i = 0; i < str2.length; i++) {
			if (str3[i] != null)
				System.out.println(str3[i]);
		}

	}
}
