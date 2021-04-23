/*
Assignment - 25 : 18th April'2021

Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/

package priyanka_Panat.assignment25;

public class StringWithNum {

	String[] findStringWithNum(String[] str) {
		String[] result = new String[str.length];
		int stringIndex = 0;
		for (int index = 0; index < str.length; index++) {
			boolean isDigit = false;
			for (int innerIndex = 0; innerIndex < str[index].length(); innerIndex++) {
				char ch = str[index].charAt(innerIndex);
				if (Character.isDigit(ch)) {
					isDigit = true;
					break;
				}
			}
			if (isDigit == true)
				result[stringIndex] = str[index];
			stringIndex++;
		}
		return result;
	}

	public static void main(String[] args) {
		StringWithNum stringWithNum = new StringWithNum();
		String[] str = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] arr = stringWithNum.findStringWithNum(str);
		System.out.println("Below are the Strings from given array which contains atleast one number : ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != null)
				System.out.println(arr[index]);

		}
	}

}
