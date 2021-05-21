/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

package rahul_Hiremath.assignment_26;

public class Ass_26_1 {

	String maxStringHavingMaxDigits(String[] str) {
		int countFirstString = 0;
		int count = 0;
		String maxDigitString = null;
		String[] output = new String[str.length];
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if (Character.isDigit(ch))
					count++;
			}
			if (count > countFirstString) {
				countFirstString = count;
				maxDigitString = str[i];
			}
			count = 0;
		}
		return maxDigitString;
	}

	public static void main(String[] args) {

		Ass_26_1 ass_26_1 = new Ass_26_1();
		String[] str = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String max = ass_26_1.maxStringHavingMaxDigits(str);
		System.out.println("String with max digits is: " + max);
	}
}
