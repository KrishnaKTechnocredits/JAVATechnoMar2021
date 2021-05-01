package sai.Assignment20;

public class SumDigitString {

	public static void main(String[] args) {
		SumDigitString sumDigitString = new SumDigitString();
		sumDigitString.getSum("J7yu9y8h1h8j4b7j3jjb6");

	}

	void getSum(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(sum);
	}

}
