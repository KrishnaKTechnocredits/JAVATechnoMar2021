/*
Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/

package sandesh.Assignment_25;

public class SumDigitsWithinString {

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
	
	int[] getSumMixedArray(String[] inMixedArrayOnly){
		int sumArrayIndex = 0;
		int[] sumArray = new int[inMixedArrayOnly.length];
		for(int index=0; index<inMixedArrayOnly.length; index++) {
			int sumDigits = 0;
			for(int innerIndex=0; innerIndex<inMixedArrayOnly[index].length(); innerIndex++) {
				if(Character.isDigit(inMixedArrayOnly[index].charAt(innerIndex))) {
					sumDigits += Character.getNumericValue(inMixedArrayOnly[index].charAt(innerIndex));
				}
			}
			sumArray[sumArrayIndex] = sumDigits;
			sumArrayIndex++;
		}
		return sumArray;
	}
	
	public static void main(String[] args) {
		String[] inputArray = {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		SumDigitsWithinString sd1 = new SumDigitsWithinString(); 
		String[] outputMixedArray = sd1.getMixedStringArray(inputArray);
		int[] mixedArraySum	= sd1.getSumMixedArray(outputMixedArray);	
		System.out.println("Sum of Strings containing atleast 1 digit are -: ");
		for(int index=0; index<mixedArraySum.length; index++)
			System.out.print("'" + mixedArraySum[index] + "', ");
	}
}
