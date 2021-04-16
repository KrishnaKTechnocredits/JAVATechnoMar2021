package dhanshri.Assignment_21;

public class SumCharNum {

	void sumNumChar(String input) {
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 48 && ch <=57)
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("Sum of numbers in input string is :" + sum);
	}

	public static void main(String[] args) {
		SumCharNum sumCharNum = new SumCharNum();
		sumCharNum.sumNumChar("J7yu9y8h1h8j4b7j3jjb6c");

	}
}
