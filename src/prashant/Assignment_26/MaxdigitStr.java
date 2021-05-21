/*Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/
package prashant.Assignment_26;

public class MaxdigitStr {
	int getMaxnumStr(String str) {
		int Count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				Count++;
			}
		}
		return Count;
	}

	public static void main(String[] args) {
		MaxdigitStr maxnumstr = new MaxdigitStr();
		int temp = 0;
		String maxnumberstr = "";
		String[] strarr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		System.out.println("Maximum digit in given String array");
		for (int i = 0; i < strarr.length; i++) {
			int result = maxnumstr.getMaxnumStr(strarr[i]);
			if (result >= temp) {
				temp = result;
				maxnumberstr = strarr[i];
			}
		}
		System.out.println(maxnumberstr);
	}
}
