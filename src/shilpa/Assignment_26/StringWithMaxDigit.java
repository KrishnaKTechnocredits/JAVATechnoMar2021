/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/

package shilpa.Assignment_26;

public class StringWithMaxDigit {

	String getStringWithMaxDigit(String[] str) {
		int max = 0;
		String maxString = "";
		for (int index = 0; index < str.length; index++) {
			int cnt = 0;
			for (int index1 = 0; index1 < str[index].length(); index1++) {
				char ch = str[index].charAt(index);
				if (Character.isDigit(ch)) {
					cnt++;
				}

			}
			if (max < cnt) {
				max = cnt;
				maxString = str[index];
			}

		}
		return maxString;
	}

	public static void main(String[] args) {
		StringWithMaxDigit stringWithMaxDigit = new StringWithMaxDigit();
		String[] str2 = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String maxString;
		maxString = stringWithMaxDigit.getStringWithMaxDigit(str2);
		System.out.println("string containing maximum digits:- " + maxString);

	}
}
