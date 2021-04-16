/*
 * 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */
package rupali.assignment20;

public class Digitcount {
	public static void main(String[] args) {
		System.out.println("Input :J7yu9y8h1h8j4b7j3jjb6");
		String input=" J7yu9y8h1h8j4b7j3jjb6";
		int sum=0;
		int i=0,j;
		char ch;
		for(i=0;i<input.length();i++) {
			ch=input.charAt(i);
			if(Character.isDigit(ch)) {
				j=Character.getNumericValue(ch);
				sum=sum+j;
			}
		}
		System.out.println("Sum of all digits in String is:"+sum);
		
	}
}
