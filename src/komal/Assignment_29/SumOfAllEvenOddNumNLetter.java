package komal.Assignment_29;

/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

public class SumOfAllEvenOddNumNLetter {
	
	String getOutput(String input) {
		int evenSum = 0;
		int oddSum = 0;
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String temp = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				if (temp.length() > 0 && index == (input.length() - 1)) {
					int num = Integer.parseInt(temp);
					if (num % 2 == 0) {
						evenSum += num;
					} else {
						oddSum += num;
					}
					temp = "";
				}
			} else if (Character.isLetter(ch)) {
				if (temp.length() > 0) {
					int num = Integer.parseInt(temp);
					if (num % 2 == 0) {
						evenSum += num;
					} else {
						oddSum += num;
					}
					temp = "";
				}
				if (Character.isUpperCase(ch))
					upperCaseStr = upperCaseStr + ch;
				else
					lowerCaseStr = lowerCaseStr + ch;
			}
		}
		return oddSum + upperCaseStr + lowerCaseStr + evenSum;
	}
		
		public static void main(String[] args) {

			SumOfAllEvenOddNumNLetter sumOfAllEvenOddNumNLetter = new SumOfAllEvenOddNumNLetter();
			sumOfAllEvenOddNumNLetter.getOutput("161FTTERTccde68");

		}
}

