package amrutaM.stringAssignments;

/*Program 3: Write a method to get the sum of all the digits from the given string
String  input : Tech1no4CRE5sit1S
*/
public class SumOfAllDigits {
	void getDigitSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				sum += Character.getNumericValue(input.charAt(index));
		}
		System.out.println("Sum of all digits of the given string is : " + sum);

	}

	public static void main(String[] args) {
		String input = "Tech1no4CRE5sit1S";
		SumOfAllDigits sumOfAllDigits = new SumOfAllDigits();
		sumOfAllDigits.getDigitSum(input);
	}
}
