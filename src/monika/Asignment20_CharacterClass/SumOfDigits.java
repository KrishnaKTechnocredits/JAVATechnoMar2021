package monika.Asignment20_CharacterClass;

/*Assignment20 part2
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

public class SumOfDigits {
	int sum = 0;
	int getSumOFDigits(String input) {
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				sum = sum + Character.getNumericValue(input.charAt(index));
			}
		}
		
		return sum;
	}
	
	void printSumValue(int sum) {
		System.out.println("Sum of all digits of given input is : "+sum);
	}
}
