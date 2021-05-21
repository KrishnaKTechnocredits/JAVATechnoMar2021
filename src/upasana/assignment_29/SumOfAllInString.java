/*
 Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
 */

package upasana.assignment_29;

public class SumOfAllInString {

	void sum(String str) {

		String cap = "";
		String small = "";
		String output = "";
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < str.length(); index++) {
			int index1=0;
			if (Character.isDigit(str.charAt(index))) {
				output = output + str.charAt(index);
				index1 =index+1;
				while (index1 < str.length() && Character.isDigit(str.charAt(index1))) {
					output = output + str.charAt(index1);
					index++;
					index1++;
					
				}
	
				if (Integer.parseInt(output) % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(output);
					output = "";

				} else {
					oddSum = oddSum + Integer.parseInt(output);
					output = "";
				}
			}

			else if (Character.isUpperCase(str.charAt(index))) {
				cap = cap + str.charAt(index);

			} else if (Character.isLowerCase(str.charAt(index))) {
				small = small + str.charAt(index);

			}
		}

		System.out.println(String.valueOf(oddSum) + cap + small + String.valueOf(evenSum));

	}

	public static void main(String[] args) {
		String str = "F12TT45ERT5cc56de111";
		new SumOfAllInString().sum(str);

	}
}
