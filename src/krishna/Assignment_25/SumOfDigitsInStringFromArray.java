package krishna.Assignment_25;

public class SumOfDigitsInStringFromArray {
	static void checkStringWithNumber(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++)
			if (Character.isDigit(str.charAt(index))) {
				int value = Character.getNumericValue(str.charAt(index));
				sum = sum + value;
			}
		System.out.println("In String " + str + " Sum of Digits is : " + sum);
	}

	static void checkStringWithNumberFromArray(String[] strArr) {
		for (int index = 0; index < strArr.length; index++) {
			checkStringWithNumber(strArr[index]);
		}
	}

	public static void main(String[] args) {
		SumOfDigitsInStringFromArray sumOfDigitsInStringFromArray = new SumOfDigitsInStringFromArray();
		String[] strArr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		sumOfDigitsInStringFromArray.checkStringWithNumberFromArray(strArr);

	}

}
