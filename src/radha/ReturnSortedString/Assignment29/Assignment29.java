/*
Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68 

Hint : (45+5+111)FTTERTccde(12+56)
 */
package radha.ReturnSortedString.Assignment29;

public class Assignment29 {

	void getSortedString(String input) {
		String lCase = "", uCase = "", number = "";
		int evenSum = 0, oddSum = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				number += Integer.parseInt(String.valueOf(ch));
			} else {
				if (number != "") {
					if (Integer.parseInt(number) % 2 == 0) {
						evenSum += Integer.parseInt(number);
					} else {
						oddSum += Integer.parseInt(number);
					}
					number = "";
				}
				if (Character.isLowerCase(ch))
					lCase += ch;
				else if (Character.isUpperCase(ch))
					uCase += ch;
			}

		}

		if (number != "") {
			if (Integer.parseInt(number) % 2 == 0)
				evenSum += Integer.parseInt(number);
			else
				oddSum += Integer.parseInt(number);
		}
		System.out.println("Odd number string is "+oddSum);
		System.out.println("Upper case string is "+uCase);
		System.out.println("Lower case string is "+lCase);
		System.out.println("Even number string is "+evenSum);
		System.out.println("=================================================");
	System.out.println("Sorted string is "+oddSum+uCase+lCase+evenSum);
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.getSortedString("F12TT45ERT5cc56de111");
		//assignment29.getSortedString("aB16DgJO4i7P71D301");
	}
}
