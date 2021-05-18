package sandesh.Assignment_28;

import java.util.Scanner;

public class ReturnSortedString {
	
	// This method can be used if use of in built methods is permitted
	/*String getSortedString(String inputString) {
		String digitsString = "";
		String upperCaseString = "";
		String lowerCaseString = "";
		for(int index = 0; index < inputString.length(); index++) {
			if(Character.isDigit(inputString.charAt(index)))
				digitsString += inputString.charAt(index);
			else if(Character.isUpperCase(inputString.charAt(index)))
				upperCaseString += inputString.charAt(index);
			else if(Character.isLowerCase(inputString.charAt(index)))
				lowerCaseString += inputString.charAt(index);
		}
		
		return digitsString + upperCaseString + lowerCaseString;
	}*/
	
	// This method can be used if use of in built methods is NOT permitted
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
		
		return digitsString + upperCaseString + lowerCaseString;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter String which needs to be sorted -: ");
		String inputString = sc1.next();
		//String outputSortedString = new ReturnSortedString().getSortedString(inputString);
		String outputSortedString = new ReturnSortedString().getSortedStringWithoutInbuiltMethods(inputString);
		System.out.println("The sorted String output is -: " + outputSortedString);
		sc1.close();
	}
}
