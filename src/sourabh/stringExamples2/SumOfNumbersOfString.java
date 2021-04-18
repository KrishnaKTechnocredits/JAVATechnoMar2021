/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */

package sourabh.stringExamples2;

public class SumOfNumbersOfString {
	void getSumOfNumbersOfString(String str) {
		int sum=0;
		for(int index=0; index<str.length(); index++) {
			char ch= str.charAt(index);
			if(Character.isDigit(ch))
				sum= sum+ Character.getNumericValue(ch);
		}
		System.out.println("Ouput: "+sum);
		
	}
	public static void main(String[] args) {
		SumOfNumbersOfString sumOfNumbersOfString= new SumOfNumbersOfString();
		sumOfNumbersOfString.getSumOfNumbersOfString("J7yu9y8h1h8j4b7j3jjb6");
	}

}
