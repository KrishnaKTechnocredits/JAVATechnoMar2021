/*Java Assignment 21:  14th April'2021

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

*/

package vaibhav.Assignment_21;

public class NumSumByAscii {

	//int sum;

	int getSum(String str) {
		int sum = 0;
		for (int index = 0; index<str.length();index++) {
			char ch = str.charAt(index);
			if (ch>=48 && ch <=57) {
				sum = sum + Character.getNumericValue(ch);
			}
		}return sum;
			
		
	}

	public static void main(String[] args) {
		String str1 = "J7yu9y8h1h8j4b7j3jjb6";
		
		NumSumByAscii numSumByAscii = new NumSumByAscii();
		
		System.out.println("Input string is : " + str1);
		System.out.println("Sum of all digits in String is : " + numSumByAscii.getSum(str1));
		
	}

}
