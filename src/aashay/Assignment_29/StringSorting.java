package aashay.Assignment_29;
/*
 * Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
 */

public class StringSorting {
	int sumOdd = 0;
	int sumEven = 0;
	String capLetter = "";
	String smallLetter = "";
	String tempNum = "";

	void stringsort(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				tempNum += ch;

			} else 
				sumOfDigit(tempNum);
			
			if (Character.isLetter(ch)) {
				sortLetters(ch);
			}
		}
		if (tempNum != "") {
			sumOfDigit(tempNum);
		}
	}

	void sumOfDigit(String num) {
		if (num != "") {
			int number = Integer.parseInt(num);
			if (number % 2 == 0) {
				sumEven += number;
			} else
				sumOdd += number;
		}
		tempNum = "";
	}

	void sortLetters(char letter) {

		if (Character.isUpperCase(letter)) {
			capLetter += letter;
		} else if (Character.isLowerCase(letter)) {
			smallLetter += letter;
		}

	}

	void display() {
		System.out.println("Output: " + sumOdd + capLetter + smallLetter + sumEven);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSorting stringSorting = new StringSorting();
		String input = "F12TT45ERT5cc56de111";
		stringSorting.stringsort(input);
		stringSorting.display();
	}

}
