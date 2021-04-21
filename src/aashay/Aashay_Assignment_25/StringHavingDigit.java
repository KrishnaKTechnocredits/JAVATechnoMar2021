package aashay.Aashay_Assignment_25;
/*
 * Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */

public class StringHavingDigit {

	String[] stringWithDigit(String[] name) {
		String[] digitString = new String[name.length];
		for (int index = 0; index < name.length; index++) {
			for (int innerIndex = 0; innerIndex < name[index].length(); innerIndex++) {
				char ch = name[index].charAt(innerIndex);
				if (Character.isDigit(ch)) {
					// System.out.println(name[index]);
					digitString[index] = name[index];
					break;

				}
			}

		}
		return digitString;

	}

	void display(String[] digitString) {
		for (int index = 0; index < digitString.length; index++) {
			if (digitString[index] != null) {
				System.out.println(digitString[index]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringHavingDigit stringHavingDigit = new StringHavingDigit();
		String[] names = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] digitString = stringHavingDigit.stringWithDigit(names);
		stringHavingDigit.display(digitString);

	}

}
