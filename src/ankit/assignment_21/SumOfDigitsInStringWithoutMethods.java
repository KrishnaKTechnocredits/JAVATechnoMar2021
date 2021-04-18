//Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string without using character class methods

package ankit.assignment_21;

public class SumOfDigitsInStringWithoutMethods {
	int size, upperCount, lowerCount, isDigitCount ;

	void findType(String str) {
		size = str.length();
		int sum = 0;
		for(int index = 0; index < size; index++) {
			int asciiValue = str.charAt(index);
			if (asciiValue >=48 && asciiValue <=57) {
				int numericValue = Character.getNumericValue(str.charAt(index));
				sum = sum + numericValue;	
			}
		}
		System.out.println("Sum of all digits in String is "+sum);
	}

	public static void main(String[] args) {
		SumOfDigitsInStringWithoutMethods sumOfDigitsInStringWithoutMethods = new SumOfDigitsInStringWithoutMethods();
		String str = "AAA88b6b0b^&^%$";
		System.out.println("String is :"+ str);
		System.out.println("-------------------");
		sumOfDigitsInStringWithoutMethods.findType(str);
		System.out.println("-----------------------------");
	}
}