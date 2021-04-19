package ashtha.Assignment19;

import java.util.Scanner;

public class Assignment19 {

	String countUpperLowerCase(String input) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			}else 
			lowerCaseCount++;
		}

		if (upperCaseCount > lowerCaseCount)
			return "Techno";
		return "Credits";
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string value");
		String inputString = scanner.next();
		String result = assignment19.countUpperLowerCase(inputString);
		if (result.equals("Techno")) {
			System.out.println("The upper case count is higher");
		}else
			System.out.println("The lower case count is higher");
		System.out.println("Output : " + result);
		scanner.close();
	}
}
