package mayur.assignment29;

public class StringSum {
	void getSum(String str) {
		int length = str.length();
		String number = "";
		String capitalLetters = "";
		String smallLetters = "";
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);

			if (Character.isUpperCase(ch))
				capitalLetters = capitalLetters + ch;
			else if (Character.isLowerCase(ch))
				smallLetters = smallLetters + ch;

			if (Character.isDigit(ch))
				number = number + ch;

			if (index != (length - 1)) {
				char ch1 = str.charAt(index + 1);
				if (Character.isDigit(ch) && (Character.isLetter(ch1))) {
					if (Integer.parseInt(number) % 2 == 0) {
						evenSum = evenSum + Integer.parseInt(number);
						number = "";
					} else
						oddSum = oddSum + Integer.parseInt(number);
					number = "";
				}
			}
		}

		if (number != "") {
			if (Integer.parseInt(number) % 2 == 0)
				evenSum = evenSum + Integer.parseInt(number);
			else
				oddSum = oddSum + Integer.parseInt(number);
		}
		System.out.println("Capital letters in string are :" + capitalLetters);
		System.out.println("Small letters in string are :" + smallLetters);
		System.out.println("Even numbers in string are :" + evenSum);
		System.out.println("Odd numbers in string are :" + oddSum);
		System.out.println("Final Output string is : " + oddSum + capitalLetters + smallLetters + evenSum);
	}

	public static void main(String[] a) {
		StringSum sum = new StringSum();
		String str = "12FTT45ERT5cc56de111";
		sum.getSum(str);
	}

}
