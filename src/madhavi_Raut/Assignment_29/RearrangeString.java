package madhavi_Raut.Assignment_29;
/*Assignment 29 : 27 April

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68 */

public class RearrangeString {
	String num = "0";
	int oddNumbers = 0, evenNumbers = 0;

	void getOddEvenNumber(String num) {
		int intNum = Integer.parseInt(num);
		if (intNum % 2 == 0)
			evenNumbers += intNum;
		else
			oddNumbers += intNum;
	}

	String getRerrangedString(String str) {
		String capitalLetters = "", smallLetters = "";
		boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				num += ch;
				if (index == str.length() - 1) {
					getOddEvenNumber(num);
					break;
				} else if (Character.isDigit(str.charAt(index + 1))) {
					index++;
					while (Character.isDigit(str.charAt(index))) {
						num += str.charAt(index);
						if (index == str.length() - 1) {
							flag = false;
							break;
						}
						index++;
					}
					if (flag)
						index--;
				}
				getOddEvenNumber(num);
				num = "0";
			} else if (Character.isLowerCase(ch)) {
				smallLetters += ch;
			} else if (Character.isUpperCase(ch)) {
				capitalLetters += ch;
			}
		}
		return oddNumbers + capitalLetters + smallLetters + evenNumbers;
	}

	public static void main(String[] args) {
		System.out.println("sum of all odd numbers + capital letter + small letter + sum of all even numbers:");
		System.out.println(new RearrangeString().getRerrangedString("F12TT45ERT5cc56de111"));
	}
}
