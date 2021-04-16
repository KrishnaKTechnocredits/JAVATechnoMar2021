/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */

package ravindra_J.Assingment_No_20_ASCII_Value;

public class SumOfDigitInPredefinedString {
	static int sum=0,num=0;
	public static void main(String[] args) {
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch))

				sum = sum + Character.getNumericValue(ch);

		}
		System.out.println("sum all the numbers in given string: "+sum);
	}

}
