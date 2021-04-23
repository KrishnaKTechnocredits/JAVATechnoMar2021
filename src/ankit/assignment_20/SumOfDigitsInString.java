// WAP to sum all the numbers in given string.


package ankit.assignment_20;

public class SumOfDigitsInString {

	void sumOfDigits(String str) {
		int size = str.length();
		int sum = 0;
		for(int index = 0 ; index < size ; index++) {
			if(Character.isDigit(str.charAt(index))) {
				int numericValue = Character.getNumericValue((str.charAt(index)));
				sum = sum + numericValue;
			}	
		}System.out.println("Digits count in String is :"+sum);
	}

	public static void main(String[] args) {
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		String str = "A6AA88bbb^&^%$8";
		int size = str.length();
		System.out.println("String is :"+ str);
		System.out.println("-------------------");
		sumOfDigitsInString.sumOfDigits(str);
	}
}
