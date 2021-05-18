package monali.Asiignment_29;


public class sumOfString {
	String lowerCase = "";
	String upperCase = "";
	int evensum = 0;
	int oddsum = 0;
	String digit = "";

	void getString(String input) {
		for (int i = 0; i < input.length() - 1; i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else {
				sumOfDigit();
			}
			if (Character.isLetter(ch)) {
				getLetter(ch);
			}
		}
		if (digit != "") {
			sumOfDigit();
		}
	}

	void sumOfDigit() {
		if (digit != "") {
			int num = Integer.parseInt(digit);
			if (num % 2 == 0) {
				evensum = evensum + num;
			} else
				oddsum = oddsum + num;
		}
		digit = "";
	}

	void getLetter(char ch) {

		if (Character.isLetter(ch)) {
			if (Character.isUpperCase(ch))
				upperCase = upperCase + (ch);
			else if (Character.isLowerCase(ch))
				lowerCase = lowerCase + (ch);
		}

	}

	void display() {
		System.out.println("output:" + evensum + upperCase + lowerCase + oddsum);

	}

	public static void main(String[] args) {
		sumOfString M1 = new sumOfString();
		M1.getString("mo30NA54li23fff29MMs");
		M1.display();
	}

}