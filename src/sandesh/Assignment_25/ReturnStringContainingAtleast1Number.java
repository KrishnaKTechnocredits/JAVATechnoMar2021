/*
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/

package sandesh.Assignment_25;

public class ReturnStringContainingAtleast1Number {
	
	int countOfMixedStrings = 0;
	String[] getMixedStringArray(String[] inArray) {
		String[] storedMixedArray = new String[inArray.length];
		for(int index=0; index<inArray.length; index++) {
			boolean isMixedString = false;
			for(int innerIndex=0; innerIndex<inArray[index].length(); innerIndex++) {
				if(Character.isDigit(inArray[index].charAt(innerIndex))) {
					isMixedString = true;
					break;
				}
			}
			if(isMixedString) {
				storedMixedArray[countOfMixedStrings] = inArray[index];
				countOfMixedStrings++;
			}
		}
		return storedMixedArray;
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		ReturnStringContainingAtleast1Number rs1 = new ReturnStringContainingAtleast1Number(); 
		String[] outputArray = rs1.getMixedStringArray(inputArray);
		System.out.println("Strings containing atleast 1 digit are -: ");
		for(int index=0; index<rs1.countOfMixedStrings; index++)
			System.out.print("'" + outputArray[index] + "', ");
	}
}
