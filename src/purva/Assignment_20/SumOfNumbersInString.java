package purva.Assignment_20;

public class SumOfNumbersInString {
	
	void sumOfNumbers(String input) {
		int sum = 0;
		for(int index = 0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				sum = sum + Character.getNumericValue(input.charAt(index));
		}
		System.out.println("Sum of all digits in string is "+sum);
	}
	
	public static void main(String [] args) {
		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		sumOfNumbersInString.sumOfNumbers("J7yu9y8h1h8j4b7j3jjb6");
	}
}
