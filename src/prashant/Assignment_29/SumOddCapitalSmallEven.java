/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

package prashant.Assignment_29;

public class SumOddCapitalSmallEven {
	String getString(String str) {
		String upperCase = " ";
		String lowerCase = " ";
		String strNum = "";
		int evenNum = 0;
		int Oddnum = 0;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				strNum = strNum + ch;
			}
			if (Character.isLetter(ch) || (i == (str.length() - 1))) {
				if (strNum != "") {
					int number = Integer.parseInt(strNum);
					if (number % 2 == 0) {
						evenNum += number;
						strNum = "";
					} else {
						Oddnum += number;
						strNum = "";
					}
				}
			}
			if (!ch.isDigit(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCase += ch;
				} else if (Character.isLowerCase(ch)) {
					lowerCase += ch;
				}
			}
		}
		return Oddnum + upperCase + lowerCase + evenNum;
	}

	public static void main(String[] args) {
		SumOddCapitalSmallEven test = new SumOddCapitalSmallEven();
		String str = "F12TT45ERT5cc56de111";
		String output = test.getString(str);
		System.out.println(output.replaceAll("\\s", ""));
	}
}
