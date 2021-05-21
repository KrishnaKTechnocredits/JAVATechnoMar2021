//2) WAP to sum all the numbers in given string.
//Input: J7yu9y8h1h8j4b7j3jjb6
//Ouput: Sum of all digits in String is: 53

package kapil.CharMethod;

public class SumDigits {

	void getSumDigits(String str) {
		int sum = 0;
		int length = str.length();
		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum = sum + (Character.getNumericValue(ch));
		}

		{
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {
		SumDigits sumdigit = new SumDigits();
		sumdigit.getSumDigits("J7yu9y8h1h8j4b7j3jjb6");
	}

}
