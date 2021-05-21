package sai.Assignment29;

public class OddUpperLowerEven {

	public static void main(String[] args) {

		OddUpperLowerEven OddUpperLowerEven = new OddUpperLowerEven();
		OddUpperLowerEven.getOddUpperLowerEven("F12TT45ERT5cc56de111");

	}

	void getOddUpperLowerEven(String str) {
		int sumOfOdd = 0;
		int sumOfEven = 0;
		String digit = "";
		String upper = "";
		String lower = "";
		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index))) {
				digit = digit + str.charAt(index);
			}
			if (Character.isLetter(str.charAt(index)) || (index == (str.length() - 1))) {
				if (digit != "") {
					if ((Integer.parseInt(digit)) % 2 == 0) {
						sumOfEven = sumOfEven + Integer.parseInt(digit);
						digit = "";
					} else {
						sumOfOdd = sumOfOdd + Integer.parseInt(digit);
						digit = "";
					}
				}
			}

			if (Character.isUpperCase(str.charAt(index))) {

				upper = upper + str.charAt(index);
			} else if (Character.isLowerCase(str.charAt(index))) {
				lower = lower + str.charAt(index);
			}
		}
		System.out.println(sumOfOdd + upper + lower + sumOfEven);
	}

}
