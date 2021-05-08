package krishna.Assignment_29;

public class SumOddEvenArrange {
	void Sum(String input) {
		int length = input.length();
		String num = "", capital = "", small = "";
		int sumEven = 0, sumOdd = 0;

		for (int index = 0; index < length; index++) {
			char ch = input.charAt(index);

			if (Character.isUpperCase(ch))
				capital = capital + ch;
			else if (Character.isLowerCase(ch))
				small = small + ch;

			if (Character.isDigit(ch))
				num = num + ch;

			if (index != (length - 1)) {
				char ch1 = input.charAt(index + 1);
				if (Character.isDigit(ch) && (Character.isLetter(ch1))) {
					if (Integer.parseInt(num) % 2 == 0) {
						sumEven = sumEven + Integer.parseInt(num);
						num = "";
					} else
						sumOdd = sumOdd + Integer.parseInt(num);
					num = "";
				}
			}
		}

		if (num != "") {
			if (Integer.parseInt(num) % 2 == 0)
				sumEven = sumEven + Integer.parseInt(num);
			else
				sumOdd = sumOdd + Integer.parseInt(num);
		}

		System.out.println("Arrange Output string : " + sumOdd + capital + small + sumEven);
	}

	public static void main(String[] args) {
		SumOddEvenArrange sumOddEvenArrange = new SumOddEvenArrange();
		String str = "12FTT45ERT5cc56de111";
		sumOddEvenArrange.Sum(str);

	}

}
