package sandesh.OWN_Practice_Sandesh_1;

import java.util.Scanner;

public class ReturnAscendingSortedString {
	
	String getAscendingDigits(String digitsString) {
		char[] digitsCharArray = digitsString.toCharArray();
		char temp = 0;
		for(int index = 0; index < digitsCharArray.length; index++) {
			for(int innerIndex = index+1; innerIndex < digitsCharArray.length; innerIndex++) {
				if( digitsCharArray[index] > digitsCharArray[innerIndex]) {
					temp = digitsCharArray[index];
					digitsCharArray[index] = digitsCharArray[innerIndex];
					digitsCharArray[innerIndex] = temp;
				}
			}
			digitsCharArray[index] = digitsCharArray[index];
		}
		return String.valueOf(digitsCharArray);
	}
	
	String getAscendingUpperCase(String upperCaseString) {
		char[] upperCaseCharArray = upperCaseString.toCharArray();
		char temp = 0;
		for(int index = 0; index < upperCaseCharArray.length; index++) {
			for(int innerIndex = index+1; innerIndex < upperCaseCharArray.length; innerIndex++) {
				if( upperCaseCharArray[index] > upperCaseCharArray[innerIndex]) {
					temp = upperCaseCharArray[index];
					upperCaseCharArray[index] = upperCaseCharArray[innerIndex];
					upperCaseCharArray[innerIndex] = temp;
				}
			}
			upperCaseCharArray[index] = upperCaseCharArray[index];
		}
		return String.valueOf(upperCaseCharArray);
	}
	
	String getAscendingLowerCase(String lowerCaseString) {
		char[] lowerCaseCharArray = lowerCaseString.toCharArray();
		char temp = 0;
		for(int index = 0; index < lowerCaseCharArray.length; index++) {
			for(int innerIndex = index+1; innerIndex < lowerCaseCharArray.length; innerIndex++) {
				if( lowerCaseCharArray[index] > lowerCaseCharArray[innerIndex]) {
					temp = lowerCaseCharArray[index];
					lowerCaseCharArray[index] = lowerCaseCharArray[innerIndex];
					lowerCaseCharArray[innerIndex] = temp;
				}
			}
			lowerCaseCharArray[index] = lowerCaseCharArray[index];
		}
		return String.valueOf(lowerCaseCharArray);
	}
	
	String getSortedStringWithoutInbuiltMethods(String inputString) {
		String digitsString = "";
		String upperCaseString = "";
		String lowerCaseString = "";
		for(int index = 0; index < inputString.length(); index++) {
			if(inputString.charAt(index) >= 48 && inputString.charAt(index) <= 57)
				digitsString += inputString.charAt(index);
			else if(inputString.charAt(index) >= 65 && inputString.charAt(index) <= 90)
				upperCaseString += inputString.charAt(index);
			else if(inputString.charAt(index) >= 97 && inputString.charAt(index) <= 122)
				lowerCaseString += inputString.charAt(index);
		}
		String ascendingDigits = getAscendingDigits(digitsString);
		String ascendingUpperCase = getAscendingUpperCase(upperCaseString);
		String ascendingLowerCase = getAscendingLowerCase(lowerCaseString);
		return ascendingDigits + ascendingUpperCase + ascendingLowerCase;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String which needs to be sorted -: ");
		String inputString = sc1.next();
		String outputSortedString = new ReturnAscendingSortedString().getSortedStringWithoutInbuiltMethods(inputString);
		System.out.println("The sorted String output is -: ");
		System.out.println(outputSortedString);
		sc1.close();
	}
}

