package anubhav.StringOperations;

import java.util.Scanner;

public class SortingOfCharactersInAString {

	String sortingOfElements(String input) {
		String digitsInString    = ""; int digitCount=0;
		String uppercaseInString = ""; int upperCount=0;
		String lowercaseInString = ""; int lowerCount=0;
		
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				digitsInString = digitsInString + input.charAt(index);
				digitCount++;
			}else if (Character.isUpperCase(input.charAt(index))) {
				uppercaseInString = uppercaseInString + input.charAt(index);
				upperCount++;
			}else if (Character.isLowerCase(input.charAt(index))){
				lowercaseInString = lowercaseInString + input.charAt(index);	
				lowerCount++;
			}
		}
		//System.out.println("digit count : " + digitCount);
		//System.out.println("upper count : " + upperCount);
		//System.out.println("lower count : " + lowerCount);
		String output= (digitsInString+uppercaseInString+lowercaseInString);
		return output;
	}
	

	public static void main(String[] args) {
		SortingOfCharactersInAString sortingOfCharactersInAString = new SortingOfCharactersInAString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input string : ");
		String input = scanner.nextLine();
		sortingOfCharactersInAString.sortingOfElements(input);
		String temp= sortingOfCharactersInAString.sortingOfElements(input);
		System.out.println(temp);
		scanner.close();
	}
}
