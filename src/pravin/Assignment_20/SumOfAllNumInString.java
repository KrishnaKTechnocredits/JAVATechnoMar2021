/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

 	package pravin.Assignment_20;
 	public class SumOfAllNumInString {
			void sumNum(String input) {
			int sum = 0;
				for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch))
					sum = sum + Character.getNumericValue(ch);
			}
			System.out.println("Sum of numbers in input string is :" + sum);
		}
			public static void main(String[] args) {
			SumOfAllNumInString sumOfAllNumInString = new SumOfAllNumInString();
			sumOfAllNumInString.sumNum("J7yu9y8h1h8j4b7j3jjb6c");
		}
	}