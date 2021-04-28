package anubhav.StringOperations;

//import java.util.Scanner;

/*Write the program to generate output in below format:-
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
			input : F12TT45ERT5cc56de111
			output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56) */

public class SumAndSortingOfNumbers { // 12,45,5,56,111

	void sumAndSorting(String input) {
		String tempNumberString = "";
		String tempLowerString = "";
		String tempUpperString = "";
		int evenSum = 0; // 12 , 56
		int oddSum = 0; // 45, 5, 111
		int number = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				tempUpperString = tempUpperString + input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index))) {
				tempLowerString = tempLowerString + input.charAt(index);
			}
		}

		for (int indexNew = 1; indexNew < input.length(); indexNew++) {
			if (Character.isDigit(input.charAt(indexNew))) {
				tempNumberString = tempNumberString + input.charAt(indexNew);
			}
			if (Character.isDigit(input.charAt(indexNew - 1)) && Character.isLetter(input.charAt(indexNew))) {
				number = Integer.parseInt(tempNumberString);
				if (number % 2 == 0) {
					evenSum = evenSum + number;
					tempNumberString = "";
				} else {
					oddSum = oddSum + number;
					tempNumberString = "";
				}
			}
		}
		int number2= Integer.parseInt(tempNumberString)	;
		if (number2 % 2 == 0) {
				evenSum = evenSum + number2;
			} else {
				oddSum = oddSum + number2;
			}
		System.out.println(oddSum + tempUpperString + tempLowerString + evenSum);
	}

	public static void main(String[] args) {
		SumAndSortingOfNumbers sumAndSortingOfNumbers = new SumAndSortingOfNumbers();
		// Scanner scanner= new Scanner(System.in);
		sumAndSortingOfNumbers.sumAndSorting("F12TT45ERT5cc56de111");
		// scanner.close();
	}
}
