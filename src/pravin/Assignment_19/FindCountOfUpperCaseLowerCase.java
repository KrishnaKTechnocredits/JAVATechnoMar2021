/*Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/


package pravin.Assignment_19;

public class FindCountOfUpperCaseLowerCase {
	int uppercasecount = 0;
	int lowerCaseCount = 0;
	void characterCount(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index)))
				uppercasecount++;
			else
				lowerCaseCount++;
		}
		if (uppercasecount > lowerCaseCount)
			System.out.println("Techno");
		else
			System.out.println("credit");
	}
	public static void main(String[] args) {
	new FindCountOfUpperCaseLowerCase().characterCount("PRAVINiumVASE");
	}
} 
