/*Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/
package prashant.Assignment_25;

public class SumNumString {
	int getSumNumStr(String str) {
		int numsum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				numsum = numsum + Character.getNumericValue(str.charAt(i));
			}
		}
		return numsum;
	}

	public static void main(String[] args) {
		SumNumString numstr = new SumNumString();
		String[] strarr = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		System.out.println("Sum of all numbers in each String given in array");
		for (int i = 0; i < strarr.length; i++) {
			int result = numstr.getSumNumStr(strarr[i]);
			if (result != 0)
				System.out.println(result);
		}
	}
}
