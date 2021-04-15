/*Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits*/

package sangeeta.CharacterClassprograms2;

import java.util.Scanner;

public class MaxCount_UpperCase_LowerCase {
	int Uppercount;
	int Lowercount;

	String getUpperCaseLowerCaseCount(String str) {

		for (int i = 0; i < str.length() - 1; i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				Uppercount++;
			else
				Lowercount++;
		}
		if (Uppercount > Lowercount) {
			System.out.println("Techno");
			return "Techno";
		} else {
			System.out.println("Credits");
			return "Credits";
		}
	}

	public static void main(String[] a) {
		MaxCount_UpperCase_LowerCase maxCount_UpperCase_LowerCase = new MaxCount_UpperCase_LowerCase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = scanner.next();
		maxCount_UpperCase_LowerCase.getUpperCaseLowerCaseCount(str);
	}

}
