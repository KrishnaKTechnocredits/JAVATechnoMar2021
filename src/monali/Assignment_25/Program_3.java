package monali.Assignment_25;

public class Program_3 {

	int getSumOfDigitInString(String input) {
		char ch;
		int num;
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				num = Character.getNumericValue(ch);
				sum += num;
			}
		}
		System.out.println(sum);

		return sum;
	}

	void sumOfString(String[] input) {
		int[] input1 = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			getSumOfDigitInString(input[i]);

		}
	}

	public static void main(String[] args) {
		String[] names = { "mon3al5i", "sau5r6av", "vikas", "jy3o7t7i" };
		new Program_3().sumOfString(names);

	}
}
