/* Program 2:
 Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 
 */

package amruta.Assignment_25;

public class ReturnAllstring {
	
	String[] printStringwithDigit(String[] names) {
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
		
		String[] str = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };

		String[] stringwithDigit = new ReturnAllstring().printStringwithDigit(str);
				
		System.out.println("String which contains Digits.");
		
		for (int index = 0; index < stringwithDigit.length; index++) {
			if (stringwithDigit[index] != null)
				System.out.println(stringwithDigit[index]);
		}
		
	}

}
