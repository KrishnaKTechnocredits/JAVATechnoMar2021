package madhavi_Raut.Assignment_19;
/*Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase 
character count is higher then LowerCase character count, otherwise return
"Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits*/

public class FindCountOfUpperCaseLowerCase {

	String findCountOfUpperCaseLowerCase(String str) {
		int upperCaseCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isUpperCase(str.charAt(index)))
				upperCaseCount++;
		}
		if (upperCaseCount > (str.length() - upperCaseCount))
			return "Techno";
		else
			return "Credits";
	}

	public static void main(String[] args) {
		System.out.println(new FindCountOfUpperCaseLowerCase().findCountOfUpperCaseLowerCase("TeCHnoSessionS"));
	}
}