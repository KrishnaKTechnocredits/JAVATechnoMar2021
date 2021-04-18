/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is 
higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
*/
package ravindra_J.Assignment_No_19_CharacterCountInString;

import java.util.Scanner;

public class LowerUpperCharCountOfString {
String str1;
static int upperCount = 0, lowerCount=0;

	static String getLowercaseUppercaseCount() {
		if(upperCount > lowerCount)
			return "Techno";
		else if(upperCount == lowerCount)
			return "LowerCase and Uppercase Count are Same in a given String";
		else
			return"Credits";
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String with Uppercase and Lowercase letters");
		String str = scanner.next();
		scanner.close();
		for(int index=0; index < str.length();index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				
				upperCount++;
			}
			else {
				
				lowerCount++;
			}
			
		}
		System.out.println(getLowercaseUppercaseCount());
	}

}
