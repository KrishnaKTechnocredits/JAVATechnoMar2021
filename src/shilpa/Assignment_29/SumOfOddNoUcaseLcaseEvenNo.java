/*Assignment - 29 : 27th April'2021
Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
*/
package shilpa.Assignment_29;

public class SumOfOddNoUcaseLcaseEvenNo {
	void getSumOddNoUcaseLcaseEvenNo(String str) {
		int sumOfOdd = 0;
		int sumOfEven = 0;
		String strDigit = "";
		String strUcase = "";
		String strLcase = "";
		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index))) {
				strDigit = strDigit + str.charAt(index);
			}
			if (Character.isLetter(str.charAt(index)) || (index == (str.length() - 1))) {
				if (strDigit != "") {
					if ((Integer.parseInt(strDigit)) % 2 == 0) {
						sumOfEven = sumOfEven + Integer.parseInt(strDigit);
						strDigit = "";
					} else {
						sumOfOdd = sumOfOdd + Integer.parseInt(strDigit);
						strDigit = "";
					}
				}
			}

			if (Character.isUpperCase(str.charAt(index))) {

				strUcase = strUcase + str.charAt(index);
			} else if (Character.isLowerCase(str.charAt(index))) {
				strLcase = strLcase + str.charAt(index);
			}
		}
		System.out.println(sumOfOdd + strUcase + strLcase + sumOfEven);
	}

	public static void main(String[] args) {
		SumOfOddNoUcaseLcaseEvenNo sumOfOddNoUcaseLcaseEvenNo = new SumOfOddNoUcaseLcaseEvenNo();
		sumOfOddNoUcaseLcaseEvenNo.getSumOddNoUcaseLcaseEvenNo("F12TT45ERT5cc56de111");
	}
}
