package sai.Assignment21;

public class AllSum {

	public static void main(String[] args) {
		AllSum allSum = new AllSum();
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		allSum.sumOfDigits(input);
	}

	void sumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 48 && ch <= 57) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits is: " + sum);
	}
}
