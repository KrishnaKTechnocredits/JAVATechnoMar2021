package dhanshri.Assignment_19;

public class CharUpperCaseLowerCaseCount {
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
	new CharUpperCaseLowerCaseCount().characterCount("JAVASELENium");
	}
} 

