/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/
package neha_Rathi.assignment29;

public class StringRearrange {
	int sumOdd = 0;
	int sumEven = 0;
	String lower = "";
	String upper = "";
	String tempNum = "";

	void oddEvenSum1(String temp1) {
		if (temp1 != "") {
			int num = Integer.parseInt(temp1);
			if (num % 2 == 0)
				sumEven += num;
			else
				sumOdd += num;
		}
		tempNum = "";
	}

	void isletter(char letter) {
		if (Character.isUpperCase(letter))
			upper += letter;
		else if (Character.isLowerCase(letter))
			lower += letter;
	}

	String stringReaarange(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				tempNum += ch;
			else {
				oddEvenSum1(tempNum);
				isletter(ch);
			}
		}
		if (tempNum.length() > 0) {
			oddEvenSum1(tempNum);
		}
		return ("output " + sumOdd + upper + lower + sumEven);
	}

	public static void main(String[] args) {
		System.out.println(new StringRearrange().stringReaarange("F12TT45ERT5cc56de111"));

	}
}
