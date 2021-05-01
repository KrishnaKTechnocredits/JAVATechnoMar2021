package renuka.assignment21;

import java.util.Scanner;

public class SumWithoutCharacters {
	
	int numberSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			int ch = input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				ch = Character.getNumericValue(input.charAt(index));
				sum = sum + ch;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumWithoutCharacters sumOfNumbers = new SumWithoutCharacters();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string ");
		String inputString = scanner.next();
		int result = sumOfNumbers.numberSum(inputString);
		System.out.println("Output : " + result);
		scanner.close();
	}


}
