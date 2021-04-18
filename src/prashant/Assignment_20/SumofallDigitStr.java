/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
*/

package prashant.Assignment_20;

public class SumofallDigitStr {

	void digitcnt(String str) {
		int digitCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				digitCnt += Character.getNumericValue(ch);
		}
		System.out.println("Sum all the numbers in given string " + digitCnt);
	}

	public static void main(String[] args) {

		SumofallDigitStr Count = new SumofallDigitStr();
		String S = "J7yu9y8h1h8j4b7j3jjb6";
		Count.digitcnt(S);
	}
}