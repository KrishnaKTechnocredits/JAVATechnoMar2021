package sandesh.Assignment_26;

public class ReturnStringMaxDigits {
	
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

	String getMaxDigitsMixedArray(String[] inMixedArrayOnly){
		int digitArrayIndex = 0;
		int[] digitArray = new int[inMixedArrayOnly.length];
		for(int index=0; index<inMixedArrayOnly.length; index++) {
			int digitsCount = 0;
			for(int innerIndex=0; innerIndex<inMixedArrayOnly[index].length(); innerIndex++) {
				if(Character.isDigit(inMixedArrayOnly[index].charAt(innerIndex))) {
					digitsCount++;
				}
			}
			digitArray[digitArrayIndex] = digitsCount;
			digitArrayIndex++;
		}
		int maxDigits = digitArray[0];
		String stringContainingMaxDigits = inMixedArrayOnly[0];
		for(int index=1; index<digitArray.length; index++) {
			if(maxDigits < digitArray[index]) {
				maxDigits = digitArray[index];
				stringContainingMaxDigits = inMixedArrayOnly[index];
			}
		}
		return stringContainingMaxDigits;
	}

	public static void main(String[] args) {
		String[] inputArray = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		ReturnStringMaxDigits rsm1 = new ReturnStringMaxDigits(); 
		String[] outputMixedArray = rsm1.getMixedStringArray(inputArray);
		String maxDigitsString	= rsm1.getMaxDigitsMixedArray(outputMixedArray);	
		System.out.println("Strings containing maximum digits is -: " + "'" + maxDigitsString + "'");
	}
}
