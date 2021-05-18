package madhavi_Raut.Assignment_25;
/*Program 2: Write a method which will return all String from given array 
which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

public class FindStringWithDigit {

	String[] getStringWithDigit(String[] names) {
		String[] namesWithDigitArray = new String[names.length];
		int count = 0;
		for (int index = 0; index < names.length; index++) {
			for (int innerIndex = 0; innerIndex < names[index].length(); innerIndex++) {
				if (Character.isDigit(names[index].charAt(innerIndex))) {
					namesWithDigitArray[count] = names[index];
					count++;
					break;
				}
			}
		}
		return namesWithDigitArray;
	}

	public static void main(String[] args) {
		String[] namesWithDigitArray = new FindStringWithDigit()
				.getStringWithDigit(new String[] { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" });
		System.out.println("Below are the names with digit.");
		for (int index = 0; index < namesWithDigitArray.length; index++) {
			if (namesWithDigitArray[index] != null)
				System.out.println(namesWithDigitArray[index]);
		}
	}
}
