package komal.Assignment_29;

/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

public class SumOfAllEvenOddNumNLetter {

	void getSum(String input) {
		int evensum = 0;
		int oddsum = 0;
		String uppercase = "";
		String lowercase = "";
		String temp = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (Character.isLetter(ch)) {

				if (!temp.equals(""))
					if (Integer.parseInt(temp) % 2 == 0)
						evensum = evensum + Integer.parseInt(temp);
					else
						oddsum = oddsum + Integer.parseInt(temp);
				temp = "";

				if (Character.isUpperCase(ch)) {
					uppercase = uppercase + ch;
				}
				if (Character.isLowerCase(ch)) {
					lowercase = lowercase + ch;
				}
			}

		}
		if (Integer.parseInt(temp) % 2 == 0)
			evensum = evensum + Integer.parseInt(temp);
		else
			oddsum = oddsum + Integer.parseInt(temp);
		System.out.println(oddsum + uppercase + lowercase + evensum);
	}

	public static void main(String[] args) {
		SumOfAllEvenOddNumNLetter sumOfAllEvenOddNumNLetter = new SumOfAllEvenOddNumNLetter();
		sumOfAllEvenOddNumNLetter.getSum("%F12TT45ERT5cc56de111");

	}
}
