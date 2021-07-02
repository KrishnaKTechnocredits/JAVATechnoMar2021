package amrutaM.stringAssignments;

/*WAP to sum all the numbers in given string.
	Input: J7yu9y8h1h8j4b7j3jjb6
	Ouput: Sum of all digits in String is: 53
*/
	public class SumNumberFromString {
	
	static void getDigitSum(String input) {
		int sum=0;
		for(int index=0; index<input.length();index++) {
			if(Character.isDigit(input.charAt(index)))
				sum+= Character.getNumericValue(input.charAt(index));
		}
		System.out.println("Sum of all digits in String is: "+sum);
	}
	
	public static void main(String[] args) {
		String input = "J7yu9y8h1h8j4b7j3jjb6";
		getDigitSum(input);
	}
}
